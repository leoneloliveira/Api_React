// components/AbrigoForm.js
"use client"; // Garante que este componente seja renderizado no lado do cliente

import { useState } from 'react';

const AbrigoForm = () => {
  const [nome, setNome] = useState('');
  const [endereco, setEndereco] = useState('');
  const [telefone, setTelefone] = useState('');
  const [email, setEmail] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    const abrigo = { nome, endereco, telefone, email };

    try {
      const response = await fetch('http://localhost:8080/abrigos', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(abrigo),
      });

      if (response.ok) {
        alert('Abrigo cadastrado com sucesso!');
        setNome('');
        setEndereco('');
        setTelefone('');
        setEmail('');
      } else {
        const errorData = await response.json();
        alert(`Erro ao cadastrar o abrigo: ${errorData.message || 'Erro desconhecido.'}`);
      }
    } catch (error) {
      console.error('Erro na requisição:', error);
      alert('Erro na comunicação com o servidor.');
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label>Nome:</label>
        <input type="text" value={nome} onChange={(e) => setNome(e.target.value)} required />
      </div>
      <div>
        <label>Endereço:</label>
        <input type="text" value={endereco} onChange={(e) => setEndereco(e.target.value)} required />
      </div>
      <div>
        <label>Telefone:</label>
        <input type="text" value={telefone} onChange={(e) => setTelefone(e.target.value)} required />
      </div>
      
      <button type="submit">Cadastrar Abrigo</button>
    </form>
  );
};

export default AbrigoForm;
