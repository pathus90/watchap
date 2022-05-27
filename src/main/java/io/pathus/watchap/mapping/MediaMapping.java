package io.pathus.watchap.mapping;

import io.pathus.watchap.common.MessageType;
import io.pathus.watchap.message.media.Media;
import io.pathus.watchap.message.media.ImageMessage;
import io.pathus.watchap.message.media.AudioMessage;
import io.pathus.watchap.message.media.VideoMessage;
import io.pathus.watchap.message.media.DocumentMessage;
import io.pathus.watchap.message.media.StickerMessage;

public final class MediaMapping {
    private MediaMapping(){}

    public static ImageMessage populateImageMessage(String recipientId, String id, boolean isLink) {
        return ImageMessage.builder()
            .to(recipientId)
            .type(MessageType.IMAGE.toString())
            .image(populateMedia(id, isLink))
            .build();
    }

    public static AudioMessage populateAudioMessage(String recipientId, String id, boolean isLink) {
        return AudioMessage.builder()
            .to(recipientId)
            .type(MessageType.AUDIO.toString())
            .audio(populateMedia(id, isLink))
            .build();
    }

    public static VideoMessage populateVideoMessage(String recipientId, String id, boolean isLink) {
        return VideoMessage.builder()
            .to(recipientId)
            .type(MessageType.VIDEO.toString())
            .video(populateMedia(id, isLink))
            .build();
    }

    public static DocumentMessage populateDocumentMessage(String recipientId, String id, boolean isLink) {
        return DocumentMessage.builder()
            .to(recipientId)
            .type(MessageType.DOCUMENT.toString())
            .document(populateMedia(id, isLink))
            .build();
    }

    public static StickerMessage populateStickerMessage(String recipientId, String value, boolean isLink) {
        return StickerMessage.builder()
            .to(recipientId)
            .type(MessageType.STICKER.toString())
            .sticker(populateMedia(value, isLink))
            .build();
    }


    private static Media populateMedia(String value, boolean isLink) {
        return Media.builder()
            .id(isLink ? null : value)
            .link(!isLink ? null : value)
            .build();
    }
}
