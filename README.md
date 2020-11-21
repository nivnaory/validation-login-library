# validation-login-library
[![](https://jitpack.io/v/nivnaory/validation-login-library.svg)](https://jitpack.io/#nivnaory/validation-login-library)

[![](https://www.youtube.com/watch?v=zePqM-iL5fU&t=675s)


Library for checking user creation based on email and password




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
**`Receives the email you want to check and displays a message accordingly
`**
```Java
checkEmail(String email);
```

**`Receives the password you want to check and displays a message accordingly `**
```Java
checkPassword(String password);
```
## Credits







