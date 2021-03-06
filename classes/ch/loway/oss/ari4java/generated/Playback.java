package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 31 18:05:10 CEST 2016
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface Playback {

// String getLanguage
/**********************************************************
 * For media types that support multiple languages, the language requested for playback.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getLanguage();



// void setState String
/**********************************************************
 * Current state of the playback operation.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setState(String val );



// void setLanguage String
/**********************************************************
 * For media types that support multiple languages, the language requested for playback.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setLanguage(String val );



// String getId
/**********************************************************
 * ID for this playback operation
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getId();



// void setTarget_uri String
/**********************************************************
 * URI for the channel or bridge to play the media on
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setTarget_uri(String val );



// void setMedia_uri String
/**********************************************************
 * URI for the media to play back.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setMedia_uri(String val );



// String getTarget_uri
/**********************************************************
 * URI for the channel or bridge to play the media on
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getTarget_uri();



// void setId String
/**********************************************************
 * ID for this playback operation
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setId(String val );



// void setNext_media_uri String
/**********************************************************
 * If a list of URIs is being played, the next media URI to be played back.
 * 
 * @since ari_1_10_0
 *********************************************************/
 public void setNext_media_uri(String val );



// String getNext_media_uri
/**********************************************************
 * If a list of URIs is being played, the next media URI to be played back.
 * 
 * @since ari_1_10_0
 *********************************************************/
 public String getNext_media_uri();



// String getMedia_uri
/**********************************************************
 * URI for the media to play back.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getMedia_uri();



// String getState
/**********************************************************
 * Current state of the playback operation.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getState();


}
;
