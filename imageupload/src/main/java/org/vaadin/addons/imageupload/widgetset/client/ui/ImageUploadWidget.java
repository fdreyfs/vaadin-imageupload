package org.vaadin.addons.imageupload.widgetset.client.ui;

import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.vaadin.client.ui.VUpload;

public class ImageUploadWidget extends VUpload {

    public ImageUploadWidget() {
        super();
        // The panel containing the FileUpload
        getWidget().addAttachHandler(new Handler() {

            @Override
            public void onAttachOrDetach(AttachEvent event) {
                if (event.isAttached()) {
                    fu.getElement().setAttribute("accept", "image/*");
                    fu.getElement().setAttribute("capture", "camera");
                    // To auto-click on input
                    // InputElement input = (InputElement) fu.getElement().cast();
                    // input.click();
                }

            }
        });
    }

}
