package org.vaadin.addons.imageupload.widgetset.client;

import org.vaadin.addons.imageupload.ImageUpload;
import org.vaadin.addons.imageupload.widgetset.client.ui.ImageUploadWidget;

import com.vaadin.client.ui.upload.UploadConnector;
import com.vaadin.shared.ui.Connect;

@Connect(ImageUpload.class)
public class ImageUploadConnector extends UploadConnector {

    private static final long serialVersionUID = 8949138809056681970L;

    @Override
    public ImageUploadWidget getWidget() {
        return (ImageUploadWidget) super.getWidget();
    }

}
