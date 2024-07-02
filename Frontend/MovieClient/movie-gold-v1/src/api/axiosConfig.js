import axios from "axios";

export default axios.create({
  baseURL:'https://569b-203-189-184-74.ngrok-free.app',
  headers:{"ngrok-skip-browser-warning": "true"}
});