declare module "react-native-image-base64-png" {
  export default class ImgToBase64 {
    static getBase64String(filePath: string): Promise<string>;
  }
}
