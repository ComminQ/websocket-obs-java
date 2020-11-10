package net.twasi.obsremotejava.requests.GetSceneItemProperties;

import com.google.gson.annotations.SerializedName;

import net.twasi.obsremotejava.OBSCommunicator;
import net.twasi.obsremotejava.requests.BaseRequest;
import net.twasi.obsremotejava.requests.RequestType;

public class GetSceneItemPropertiesRequest extends BaseRequest {

  	@SerializedName("scene-name")
    private String scene;
    private String item;

    public GetSceneItemPropertiesRequest(OBSCommunicator com, String scene, String source) {
        super(RequestType.GetSceneItemProperties);

        this.scene = scene;
        this.item = source;
        
        com.messageTypes.put(getMessageId(), GetSceneItemPropertiesResponse.class);
    }
    
   
}
