# validation-login-library
[![](https://jitpack.io/v/nivnaory/validation-login-library.svg)](https://jitpack.io/#nivnaory/validation-login-library)







## Setup
Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
	maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency:

```
dependencies {
	        implementation 'com.github.nivnaory:validation-login-library:v1.0'
}
```
## Usage
Step 1. open a new class: 

<img src="https://github.com/Dtabaja/Enigma-SharedPreference/blob/master/Application2.JPG" width="500">

Step 2. implement the initHelper Function:

<img src="https://github.com/Dtabaja/Enigma-SharedPreference/blob/master/Application.JPG" width="600">

Step 3. Add your class in the manifest:

<img src="https://github.com/Dtabaja/Enigma-SharedPreference/blob/master/manifest.JPG" width="600">

## Functions



**` `**
**`Store an Integer value`**
```Java
Enigma.getInstance().putInt("6",6);
Enigma.getInstance().putIntSync("6",6);
```

**`retrieve an Integer Value `**
```Java
```	

**`retrieve an Integer Value with a default value that i choose`**
```Java
Enigma.getInstance().getInt("7",7);
```	


## Credits







