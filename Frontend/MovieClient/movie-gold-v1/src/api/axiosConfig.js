import axios from "axios";

export default axios.create({
  baseURL:'https://f546-103-247-50-146.ngrok-free.app',
  headers:{"ngrok-skip-browser-warning": "true"}
});