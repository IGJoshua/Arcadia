(ns ^{:doc "Data structure for all unity messages. Must be manually maintained."}
  arcadia.internal.messages)

;; from http://docs.unity3d.com/ScriptReference/MonoBehaviour.html
(def messages
  '{Awake []
    FixedUpdate []
    LateUpdate []
    OnAnimatorIK [System.Int32]
    OnAnimatorMove []
    OnApplicationFocus [System.Boolean]
    OnApplicationPause [System.Boolean]
    OnApplicationQuit []
    OnAudioFilterRead [|System.Single[]| System.Int32]
    OnBecameInvisible []
    OnBecameVisible []
    OnCollisionEnter [UnityEngine.Collision]
    OnCollisionEnter2D [UnityEngine.Collision2D]
    OnCollisionExit [UnityEngine.Collision]
    OnCollisionExit2D [UnityEngine.Collision2D]
    OnCollisionStay [UnityEngine.Collision]
    OnCollisionStay2D [UnityEngine.Collision2D]
    OnConnectedToServer []
    OnControllerColliderHit [UnityEngine.ControllerColliderHit]
    OnDestroy []
    OnDisable []
    OnDisconnectedFromServer [UnityEngine.NetworkDisconnection]
    OnDrawGizmos []
    OnDrawGizmosSelected []
    OnEnable []
    OnFailedToConnect [UnityEngine.NetworkConnectionError]
    OnFailedToConnectToMasterServer [UnityEngine.NetworkConnectionError]
    OnGUI []
    OnJointBreak [System.Single]
    OnLevelWasLoaded [System.Int32]
    OnMasterServerEvent [UnityEngine.MasterServerEvent]
    OnMouseDown []
    OnMouseDrag []
    OnMouseEnter []
    OnMouseExit []
    OnMouseOver []
    OnMouseUp []
    OnMouseUpAsButton []
    OnNetworkInstantiate [UnityEngine.NetworkMessageInfo]
    OnParticleCollision [UnityEngine.GameObject]
    OnPlayerConnected [UnityEngine.NetworkPlayer]
    OnPlayerDisconnected [UnityEngine.NetworkPlayer]
    OnPostRender []
    OnPreCull []
    OnPreRender []
    OnRenderImage [UnityEngine.RenderTexture UnityEngine.RenderTexture]
    OnRenderObject []
    OnSerializeNetworkView [UnityEngine.BitStream UnityEngine.NetworkMessageInfo]
    OnServerInitialized []
    OnTriggerEnter [UnityEngine.Collider]
    OnTriggerEnter2D [UnityEngine.Collider2D]
    OnTriggerExit [UnityEngine.Collider]
    OnTriggerExit2D [UnityEngine.Collider2D]
    OnTriggerStay [UnityEngine.Collider]
    OnTriggerStay2D [UnityEngine.Collider2D]
    OnValidate []
    OnWillRenderObject []
    Reset []
    Start []
    Update []})

;; http://docs.unity3d.com/ScriptReference/EventSystems.EventTrigger.html
(def interface-messages
  '{IBeginDragHandler/OnBeginDrag [PointerEventData] 
    ICancelHandler/OnCancel [BaseEventData]
    IDeselectHandler/OnDeselect [BaseEventData]
    IDragHandler/OnDrag [PointerEventData]
    IDropHandler/OnDrop [PointerEventData]
    IEndDragHandler/OnEndDrag [PointerEventData] 
    IInitializePotentialDragHandler/OnInitializePotentialDrag [PointerEventData]
    IMoveHandler/OnMove [AxisEventData]
    IPointerClickHandler/OnPointerClick [PointerEventData]
    IPointerDownHandler/OnPointerDown [PointerEventData]
    IPointerEnterHandler/OnPointerEnter [PointerEventData]
    IPointerExitHandler/OnPointerExit [PointerEventData]
    IPointerUpHandler/OnPointerUp [PointerEventData]
    IScrollHandler/OnScroll [PointerEventData]
    ISelectHandler/OnSelect [BaseEventData]
    ISubmitHandler/OnSubmit [BaseEventData]
    IUpdateSelectedHandler/OnUpdateSelected [BaseEventData]})