
# react-native-image-base64-png

This is a fork of [this](https://github.com/Snapp-FidMe/react-native-image-base64) library, modified to support png on android and export typescript types.

That repo in turn is a working rewrite of [this](https://github.com/xfumihiro/react-native-image-to-base64) abandoned library.
It provides a very simple way to convert an image to a base64 string.

If you encounter `OOM` errors on old android devices, make sure you optimize the image's size before you convert it. 
Indeed working with big images on Android might cause very high memory usage.

## Getting started

`npm install react-native-image-base64-png --save`
or
`yarn add react-native-image-base64-png`


## Installation

`$ react-native link react-native-image-base64-png`

## Usage
```javascript
import ImgToBase64 from 'react-native-image-base64-png';

ImgToBase64.getBase64String('file://youfileurl')
  .then(base64String => doSomethingWith(base64String))
  .catch(err => doSomethingWith(err));
```

## Changes made

This package has been updated based on [this](https://github.com/Snapp-FidMe/react-native-image-base64/issues/4) thread.

Simply put, `android/src/java/RNImgToBase64Module.java` has been changed as follows:
```java
bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
```
To:
```java
bitmap.compress(Bitmap.CompressFormat.PNG, 80, byteArrayOutputStream);
```

I have also added types in `index.d.ts`:
```typescript
declare module 'react-native-image-base64' {
  export default class ImgToBase64 {
    static getBase64String(filePath: string): Promise<string>;
  }
}
```

