import logo from '../../assets/img/logo.svg'
import './styles.css'

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DsMeta" />
                <h1>DsMeta</h1>
                <p>
                    Desenvolvido por&nbsp;
                    <a href="https://github.com/nadmadunderscorefourteen" target={'_blank'}>Nadyne Madureira</a>
                </p>
            </div>
        </header>
    )
}

export default Header