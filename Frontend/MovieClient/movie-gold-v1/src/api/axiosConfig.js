import axios from "axios";

export default axios.create({
  baseURL: 'https://7fef-203-189-184-216.ngrok-free.app',
  headers:{"ngrok-skip-browser-warning": "true"}
});