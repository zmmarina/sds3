import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
        <NavBar/>
        <div className="container">
            <div className="jumbotron">
                <h1 className="display-4">DanceLife Sales Management</h1>
                <p className="lead">Understanding the importance of each instructor as a seller!</p>
                <hr />
                <p>This application presents a dashboard from data provided by a back end built with Spring Boot.</p>
                <Link className="btn btn-primary btn-lg" to="/dashboard">Access Dashboard</Link>
            </div>
        </div>
        <Footer />
        </>
    );
}

export default Home;