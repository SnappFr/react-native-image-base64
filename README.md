
# react-native-img-to-base64

## Getting started

`$ npm install react-native-img-to-base64 --save`

### Mostly automatic installation

`$ react-native link react-native-img-to-base64`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-img-to-base64` and add `RNImgToBase64.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNImgToBase64.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNImgToBase64Package;` to the imports at the top of the file
  - Add `new RNImgToBase64Package()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-img-to-base64'
  	project(':react-native-img-to-base64').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-img-to-base64/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-img-to-base64')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNImgToBase64.sln` in `node_modules/react-native-img-to-base64/windows/RNImgToBase64.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNImgToBase64;` to the usings at the top of the file
  - Add `new RNImgToBase64Package()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNImgToBase64 from 'react-native-img-to-base64';

// TODO: What to do with the module?
RNImgToBase64;
```
  