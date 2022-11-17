

import Header from "./components/Header";
import NotificationButton from "./components/NotificationButton";
import Salescard from "./components/Salescard";
   function App() {

     return(
    
      <>
         <Header/>
           <main>
              <section id="sales">
                <div className="dsmeta-container">

                  <Salescard/>

                </div>
                

              </section>
            </main>
      </>

    
  )
  
}

export default App
