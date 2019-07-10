
# react-native-image-base64

This repo is a working rewrite of [this](https://github.com/xfumihiro/react-native-image-to-base64) abandoned library.
It provides a very simple way to convert an image to a base64 string.

If you encounter `OOM` errors on old android devices, make sure you optimize the image's size before you convert it. 
Indeed working with big images on Android might cause very high memory usage.

## Getting started

`npm install react-native-image-base64 --save`
or
`yarn add react-native-image-base64`


## Installation

`$ react-native link react-native-image-base64`

## Usage
```javascript
import ImgToBase64 from 'react-native-image-base64';

ImgToBase64.getBase64String('file://youfileurl')
  .then(base64String => doSomethingWith(base64String))
  .catch(err => doSomethingWith(err));
```
  
