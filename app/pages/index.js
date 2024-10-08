// components/Navbar.js
import Link from 'next/link';


const Navbar = () => {
  return (
    <nav>
      <ul>
        <li><Link href="/abrigos">Abrigos</Link></li>
        <li><Link href="/animais">Animais</Link></li>
        <li><Link href="/adocoes">Adoções</Link></li>
      </ul>
    </nav>
  );
};

export default Navbar;
