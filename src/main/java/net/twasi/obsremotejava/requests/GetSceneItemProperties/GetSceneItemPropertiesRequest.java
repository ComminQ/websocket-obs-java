package net.twasi.obsremotejava.requests.GetSceneItemProperties;

import com.google.gson.JsonObject;

import net.twasi.obsremotejava.OBSCommunicator;
import net.twasi.obsremotejava.requests.BaseRequest;
import net.twasi.obsremotejava.requests.RequestType;

public class GetSceneItemPropertiesRequest extends BaseRequest {
    private String scene;
    private String source;

    public GetSceneItemPropertiesRequest(OBSCommunicator com, String scene, String source) {
        super(RequestType.GetSceneItemProperties);

        this.scene = scene;
        this.source = source;
        com.messageTypes.put(getMessageId(), GetSceneItemPropertiesResponse.class);
    }
    
    /**
     * Return the requests fields
     * According to : https://gist.github.com/lee-brown/70e6014a903dfea9e2dfe7e35fc8ab88#scene-items
     * @author Fabien CAYRE (Computer)
     *
     * @return
     * @date 10/11/2020
     */
    public JsonObject getSpecialJson() {
    	JsonObject json = new JsonObject();
    	json.addProperty("scene-name", this.scene);
    	json.addProperty("item", this.source);
    	return json;
    }
}
