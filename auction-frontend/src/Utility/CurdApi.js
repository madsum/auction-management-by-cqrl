import axios from 'axios';

const SELL_URL = 'http://localhost:8081/api/v1/addProduct/upload4';
const BUY_URL = 'http://localhost:8082/api/v1/productLookup/all-product';


export default class CurdApi {

  static async postProduct(name, price, file) {
    try {
      let product = new FormData();    
      product.append("name", name);
      product.append("price", price);
      product.append("file", file);
      
      const response = await axios.post(SELL_URL, product , {
          headers: {
              'Content-Type': 'multipart/form-data'
            }
        });
        return response;
      //this.props.history.push("/buy"); 
  } catch (err) {
     console.log(JSON.stringify(err));
  }

  }


  static async getAllProduct() {
    try {
      const response = await axios.get(BUY_URL); //await fetch(`https://profile-back.herokuapp.com/all/profile`);
      const json = await response.data;
      return json;
    } catch (error) {
      console.log(error);
      return error.message;
    }
  }
}