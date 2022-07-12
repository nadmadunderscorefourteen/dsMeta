import Header from "./components/Header"
import SalesCard from "./components/SalesCard"

function App() {
  return (

    /* fragment tag que permite renderizar multiplos elementos html */
    <>
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <SalesCard />
          </div>
        </section>
      </main>
    </>
  )
}

export default App
