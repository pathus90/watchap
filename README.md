# Watchap

UnOfficial java Wrapper for [WhatsApp Cloud API](https://developers.facebook.com/docs/whatsapp/cloud-api)

## Built With
* JDK 11 or higher.
* Apache Maven 3.3.9 or higher

## Getting Started
### Prerequisites
To get started using this package, you will need some informations which you can get by from [Facebook Developer Portal](https://developers.facebook.com/)

1. [Go to your apps](https://developers.facebook.com/apps)
2. [create an app](https://developers.facebook.com/apps/create/)
3. Choose Bussiness as an app type
4. Screen Name (This is the app name that is associated with your App ID. You can change it later.)
5. Fill in the basic information such as password...
6. Add products to your app and choose `WhatsApp`
7. Copy your `YOUR_TOKEN`. This token will expire in 23 hours.
8. Copy `PHONE_NUMBER_ID`, which will be used as the sender number
9. create phonenumber of recipients to whom the messages will be delivered

   >  From this page, To send a test message, copy this command, paste it into Terminal, and click Enter. To create your own message template, click here.

## Usage
Before starting to use the features of the library, you need to fill in the `token` retrieved from the facebook developer portal and the `phone number` which will be used as the sender's number.
#### Exemple
```java
Watchap watchap = new Watchap(YOUR_TOKEN, PHONE_NUMBER_ID);
```
## Features supported

1. Sending Text messages
2. Sending  Media Messages (images, audio, videos, stickers and documents)
3. Sending location messages
4. Sending interactive buttons
5. Sending template messages


## Text
- Send Text Message
```java
watchap.sendMessage("337677xxxx", "this is a message");
```
- Send Text Message with Preview URL

```java
watchap.sendMessage("337677xxxx", "this is a message", true);
```
# Media
When sending media(image, video, audio, sticker and document ), 
you can either specify a link containing the media or specify object id.



- When media is an image, audio, document, or video and you are not using a link.
```java
watchap.sendMessage("337677xxxx", "media-link", false);
```
- When media is an image, audio, document, or video and you are not using a link.
```java
watchap.sendMessage("337677xxxx", "<image-object-id>", false);
```

## Image
1. Send Image Message by URL
```java
watchap.sendMessage("337677xxxx", "https://i.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI", true);
```
2. Send Image Message by ID

```java
watchap.sendMessage("337677xxxx", "<image-object-id>", false);
```

## Audio
1. Send Audio Message by URL

```java
watchap.sendAudio("337677xxxx", "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-15.mp3", true);
```

2. Send Audio Message by ID

```java
watchap.sendAudio("337677xxxx", "<image-object-id>", false);
```

## Video
1. Send Video Message by URL

```java
watchap.sendVideo("337677xxxx", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4", true);
```

2. Send Video Message by ID

```java
watchap.sendVideo("337677xxxx", "<image-object-id>", false);
```

## Document
1. Send Document Message by URL

```java
watchap.sendDocument("337677xxxx", "https://assets.website-files.com/603d0d2db8ec32ba7d44fffe/603d0e327eb2748c8ab1053f_loremipsum.pdf", true);
```

2. Send Document Message by id

```java
watchap.sendDocument("337677xxxx", "<image-object-id>", false);
```

## Sticker
1. Send Sticker Message by URL

```java
watchap.sendSticker("337677xxxx", "https://s3.getstickerpack.com/storage/uploads/sticker-pack/meme-pack-1/sticker_1.png?363e7ee56d4d8ad53813dae0907ef4c0", true);
```

2. Send Sticker Message by id

```java
watchap.sendSticker("337677xxxx", "<image-object-id>", false);
```
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Any issues, please [report here](https://github.com/pathus90/watchap/issues)

## License
[MIT](https://choosealicense.com/licenses/mit/)
