// pages/index.js (ou HomePage.js, dependendo do nome do seu arquivo)
import AbrigoForm from '../app/components/AnimalList';

const HomePage = () => {
  return (
    <div>
      <h1>Cadastro de Abrigos</h1>
      <AbrigoForm />
    </div>
  );
};

export default HomePage;
