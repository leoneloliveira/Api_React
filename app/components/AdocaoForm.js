// app/components/AdocaoForm.js
"use client";

import { useState } from 'react';

const AdocaoForm = () => {
  const [idAnimal, setIdAnimal] = useState('');
  const [idAdotante, setIdAdotante] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();

    // Validação básica
    if (!idAnimal || !idAdotante) {
      alert('Todos os campos são obrigatórios.');
      return;
    }

    // Dados a serem enviados para a API Spring Boot
    const adocao = { idAnimal, idAdotante };

    try {
      const response = await fetch('http://localhost:8080/adocoes', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(adocao),
      });

      if (response.ok) {
        alert('Adoção cadastrada com sucesso!');
        // Limpar os campos após o cadastro
        setIdAnimal('');
        setIdAdotante('');
      } else {
        const errorData = await response.json();
        alert(`Erro ao cadastrar a adoção: ${errorData.message || 'Erro desconhecido.'}`);
      }
    } catch (error) {
      console.error('Erro na requisição:', error);
      alert('Erro na comunicação com o servidor.');
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label>ID do Animal:</label>
        <input
          type="text"
          value={idAnimal}
          onChange={(e) => setIdAnimal(e.target.value)}
          required
        />
      </div>
      <div>
        <label>ID do Adotante:</label>
        <input
          type="text"
          value={idAdotante}
          onChange={(e) => setIdAdotante(e.target.value)}
          required
        />
      </div>
      <button type="submit">Cadastrar Adoção</button>
    </form>
  );
};

export default AdocaoForm;
