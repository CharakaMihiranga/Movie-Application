import axios from "axios";

export default axios.create({
  baseURL:'https://19c1-103-247-51-103.ngrok-free.app',
  headers:{"ngrok-skip-browser-warning": "true"
  }
});