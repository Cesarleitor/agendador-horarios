import { Link } from "react-router-dom"

function Navbar() {

  return (

    <nav>

      <h2>Conheça Nosso Espaço</h2>

      <div>

        <Link to="/">Home</Link>

        <Link to="/sobre">Sobre</Link>

        <Link to="/servicos">Serviços</Link>

        <Link to="/agendamento">Agendamento</Link>

        <Link to="/contato">Contato</Link>

        <Link to="/login">Login</Link>

      </div>

    </nav>

  )

}

export default Navbar