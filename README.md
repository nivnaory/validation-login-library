# validation-login-library
[![](https://jitpack.io/v/nivnaory/validation-login-library.svg)](https://jitpack.io/#nivnaory/validation-login-library)


<img src="https://github.com/Dtabaja/Enigma-SharedPreference/blob/master/enigma3.jpg" width="500">


Enigma is a library that encrypt your Shared Sreference with 256AES Encryption.

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



**`Store an Double value`**
```Java

```	

**`retrieve a Double Value`**
```Java

```	





**`Store a Boolean Value`**
```Java

```	

**`retrieve a Boolean Value`**
```Java

```	

**`retrieve n Boolean Value with a default value that i choose`**
```Java

```	





**`Store a Float Value`**
```Java

```	


**`retrieve a Float Value`**
```Java

```	

**`retrieve a Float Value with a default value that i choose`**
```Java

```	





**`Store a String Value`**
```Java

```	

**`retrieve a String Value`**
```Java

```	

**`retrieve a String Value with a default value that i choose`**
```Java

```	





**`Store a StringSet Values`**
```Java

```	
	
**`retrieve a StringSet Value`**
```Java

```	

**`retrieve a StringSet Value with a default value that i choose`**
```Java

```	

	



**`Store a HashMap Values`**
```Java

```	

**`retrieve a HashMap Values`**
```Java

```	





**`Store a ArrayList Values`**
```Java

```	

**`retrieve a ArrayList Values`**
```Java

```	

	



**`retrieve ALL the key:value that are in the Shared Preference`**
```Java

```	





**`Removes All the key:value in the Shared Preference`**
```Java

```

	



**`Giving a key, removes the value`**
```Java

```

	



**`Giving a key, retrieve true/false if the value in the Shared Preference`**
```Java

```





## Credits

Enigma picture: https://wordpandit.com/, https://pluviolover.com/2016/10/07/are-you-an-enigma/






