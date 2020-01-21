// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Peer.proto

package Catalyst.Protocol.Peer;

/**
 * <pre>
 **
 * Aggregated size of the fields in PeerId should be 42 bytes as specified in
 * https://github.com/catalyst-network/protocol-blueprint/blob/master/PeerProtocol.md
 * </pre>
 *
 * Protobuf type {@code Catalyst.Protocol.Peer.PeerId}
 */
public  final class PeerId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Catalyst.Protocol.Peer.PeerId)
    PeerIdOrBuilder {
  // Use PeerId.newBuilder() to construct.
  private PeerId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PeerId() {
    ip_ = com.google.protobuf.ByteString.EMPTY;
    port_ = 0;
    publicKey_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PeerId(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            ip_ = input.readBytes();
            break;
          }
          case 16: {

            port_ = input.readUInt32();
            break;
          }
          case 26: {

            publicKey_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Catalyst.Protocol.Peer.Peer.internal_static_Catalyst_Protocol_Peer_PeerId_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Catalyst.Protocol.Peer.Peer.internal_static_Catalyst_Protocol_Peer_PeerId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Catalyst.Protocol.Peer.PeerId.class, Catalyst.Protocol.Peer.PeerId.Builder.class);
  }

  public static final int IP_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString ip_;
  /**
   * <pre>
   * 16 bytes
   * </pre>
   *
   * <code>bytes ip = 1;</code>
   */
  public com.google.protobuf.ByteString getIp() {
    return ip_;
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_;
  /**
   * <pre>
   * 2 bytes
   * </pre>
   *
   * <code>uint32 port = 2;</code>
   */
  public int getPort() {
    return port_;
  }

  public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString publicKey_;
  /**
   * <pre>
   * Peers public key, node operators are encouraged to use the same, public key across all their nodes.
   * </pre>
   *
   * <code>bytes public_key = 3;</code>
   */
  public com.google.protobuf.ByteString getPublicKey() {
    return publicKey_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!ip_.isEmpty()) {
      output.writeBytes(1, ip_);
    }
    if (port_ != 0) {
      output.writeUInt32(2, port_);
    }
    if (!publicKey_.isEmpty()) {
      output.writeBytes(3, publicKey_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!ip_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, ip_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, port_);
    }
    if (!publicKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, publicKey_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Catalyst.Protocol.Peer.PeerId)) {
      return super.equals(obj);
    }
    Catalyst.Protocol.Peer.PeerId other = (Catalyst.Protocol.Peer.PeerId) obj;

    boolean result = true;
    result = result && getIp()
        .equals(other.getIp());
    result = result && (getPort()
        == other.getPort());
    result = result && getPublicKey()
        .equals(other.getPublicKey());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + PUBLIC_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPublicKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Catalyst.Protocol.Peer.PeerId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Peer.PeerId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Peer.PeerId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Peer.PeerId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Peer.PeerId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Peer.PeerId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Peer.PeerId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Peer.PeerId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Peer.PeerId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Peer.PeerId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Catalyst.Protocol.Peer.PeerId prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * Aggregated size of the fields in PeerId should be 42 bytes as specified in
   * https://github.com/catalyst-network/protocol-blueprint/blob/master/PeerProtocol.md
   * </pre>
   *
   * Protobuf type {@code Catalyst.Protocol.Peer.PeerId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Catalyst.Protocol.Peer.PeerId)
      Catalyst.Protocol.Peer.PeerIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Catalyst.Protocol.Peer.Peer.internal_static_Catalyst_Protocol_Peer_PeerId_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Catalyst.Protocol.Peer.Peer.internal_static_Catalyst_Protocol_Peer_PeerId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Catalyst.Protocol.Peer.PeerId.class, Catalyst.Protocol.Peer.PeerId.Builder.class);
    }

    // Construct using Catalyst.Protocol.Peer.PeerId.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      ip_ = com.google.protobuf.ByteString.EMPTY;

      port_ = 0;

      publicKey_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Catalyst.Protocol.Peer.Peer.internal_static_Catalyst_Protocol_Peer_PeerId_descriptor;
    }

    public Catalyst.Protocol.Peer.PeerId getDefaultInstanceForType() {
      return Catalyst.Protocol.Peer.PeerId.getDefaultInstance();
    }

    public Catalyst.Protocol.Peer.PeerId build() {
      Catalyst.Protocol.Peer.PeerId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Catalyst.Protocol.Peer.PeerId buildPartial() {
      Catalyst.Protocol.Peer.PeerId result = new Catalyst.Protocol.Peer.PeerId(this);
      result.ip_ = ip_;
      result.port_ = port_;
      result.publicKey_ = publicKey_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Catalyst.Protocol.Peer.PeerId) {
        return mergeFrom((Catalyst.Protocol.Peer.PeerId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Catalyst.Protocol.Peer.PeerId other) {
      if (other == Catalyst.Protocol.Peer.PeerId.getDefaultInstance()) return this;
      if (other.getIp() != com.google.protobuf.ByteString.EMPTY) {
        setIp(other.getIp());
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (other.getPublicKey() != com.google.protobuf.ByteString.EMPTY) {
        setPublicKey(other.getPublicKey());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Catalyst.Protocol.Peer.PeerId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Catalyst.Protocol.Peer.PeerId) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString ip_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 16 bytes
     * </pre>
     *
     * <code>bytes ip = 1;</code>
     */
    public com.google.protobuf.ByteString getIp() {
      return ip_;
    }
    /**
     * <pre>
     * 16 bytes
     * </pre>
     *
     * <code>bytes ip = 1;</code>
     */
    public Builder setIp(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ip_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 16 bytes
     * </pre>
     *
     * <code>bytes ip = 1;</code>
     */
    public Builder clearIp() {
      
      ip_ = getDefaultInstance().getIp();
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <pre>
     * 2 bytes
     * </pre>
     *
     * <code>uint32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <pre>
     * 2 bytes
     * </pre>
     *
     * <code>uint32 port = 2;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 2 bytes
     * </pre>
     *
     * <code>uint32 port = 2;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Peers public key, node operators are encouraged to use the same, public key across all their nodes.
     * </pre>
     *
     * <code>bytes public_key = 3;</code>
     */
    public com.google.protobuf.ByteString getPublicKey() {
      return publicKey_;
    }
    /**
     * <pre>
     * Peers public key, node operators are encouraged to use the same, public key across all their nodes.
     * </pre>
     *
     * <code>bytes public_key = 3;</code>
     */
    public Builder setPublicKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      publicKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Peers public key, node operators are encouraged to use the same, public key across all their nodes.
     * </pre>
     *
     * <code>bytes public_key = 3;</code>
     */
    public Builder clearPublicKey() {
      
      publicKey_ = getDefaultInstance().getPublicKey();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Catalyst.Protocol.Peer.PeerId)
  }

  // @@protoc_insertion_point(class_scope:Catalyst.Protocol.Peer.PeerId)
  private static final Catalyst.Protocol.Peer.PeerId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Catalyst.Protocol.Peer.PeerId();
  }

  public static Catalyst.Protocol.Peer.PeerId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PeerId>
      PARSER = new com.google.protobuf.AbstractParser<PeerId>() {
    public PeerId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PeerId(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PeerId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PeerId> getParserForType() {
    return PARSER;
  }

  public Catalyst.Protocol.Peer.PeerId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

