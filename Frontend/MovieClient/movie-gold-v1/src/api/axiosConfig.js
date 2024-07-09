import axios from "axios";

export default axios.create({
  baseURL:'https://1840-203-189-185-152.ngrok-free.app',
  headers:{"ngrok-skip-browser-warning": "true"}
});