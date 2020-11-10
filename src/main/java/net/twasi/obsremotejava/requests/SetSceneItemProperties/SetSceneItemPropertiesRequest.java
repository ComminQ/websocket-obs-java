package net.twasi.obsremotejava.requests.SetSceneItemProperties;

import com.google.gson.annotations.SerializedName;

import net.twasi.obsremotejava.OBSCommunicator;
import net.twasi.obsremotejava.objects.SceneProperties;
import net.twasi.obsremotejava.objects.SceneProperties.Bounds;
import net.twasi.obsremotejava.objects.SceneProperties.Crop;
import net.twasi.obsremotejava.objects.SceneProperties.Position;
import net.twasi.obsremotejava.objects.SceneProperties.Scale;
import net.twasi.obsremotejava.requests.BaseRequest;
import net.twasi.obsremotejava.requests.RequestType;

public class SetSceneItemPropertiesRequest extends BaseRequest {
    @SerializedName("scene-name")
    private String scene;
    private String item;
    
  	private Position position;
  	private double rotation;
  	private Scale scale;
  	private Crop crop;
  	private boolean visible;
  	private Bounds bounds;

    public SetSceneItemPropertiesRequest(OBSCommunicator com, String scene, String source, SceneProperties props) {
        super(RequestType.SetSceneItemProperties);

        this.scene = scene;
        this.item = source;
        
        this.position = props.getPosition();
        this.rotation = props.getRotation();
        this.scale = props.getScale();
        this.crop = props.getCrop();
        this.visible = props.isVisible();
        this.bounds = props.getBounds();


        com.messageTypes.put(getMessageId(), SetSceneItemPropertiesResponse.class);
    }
}
