
# react-native-img-to-base64

This repo is a working rewrite of (https://github.com/xfumihiro/react-native-image-to-base64)[this] abandonned library.
It provides a very simple way to convert an image to a base64 string.

## Getting started

`npm install react-native-img-to-base64 --save`
or
`yarn add react-native-img-to-base64`


### Installation

`$ react-native link react-native-img-to-base64`

## Usage
```javascript
import ImgToBase64 from 'react-native-img-to-base64';

ImgToBase64.getBase64String('file://youfileurl', (err, base64string) => doSomethingWith(base64string));
```
  