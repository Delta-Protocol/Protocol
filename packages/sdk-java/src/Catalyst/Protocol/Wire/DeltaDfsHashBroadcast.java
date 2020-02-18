// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Wire.proto

package Catalyst.Protocol.Wire;

/**
 * Protobuf type {@code Catalyst.Protocol.Wire.DeltaDfsHashBroadcast}
 */
public  final class DeltaDfsHashBroadcast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Catalyst.Protocol.Wire.DeltaDfsHashBroadcast)
    DeltaDfsHashBroadcastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeltaDfsHashBroadcast.newBuilder() to construct.
  private DeltaDfsHashBroadcast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeltaDfsHashBroadcast() {
    deltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;
    previousDeltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeltaDfsHashBroadcast();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeltaDfsHashBroadcast(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            deltaDfsHash_ = input.readBytes();
            break;
          }
          case 18: {

            previousDeltaDfsHash_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Catalyst.Protocol.Wire.Wire.internal_static_Catalyst_Protocol_Wire_DeltaDfsHashBroadcast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Catalyst.Protocol.Wire.Wire.internal_static_Catalyst_Protocol_Wire_DeltaDfsHashBroadcast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Catalyst.Protocol.Wire.DeltaDfsHashBroadcast.class, Catalyst.Protocol.Wire.DeltaDfsHashBroadcast.Builder.class);
  }

  public static final int DELTA_DFS_HASH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString deltaDfsHash_;
  /**
   * <pre>
   * The DFS address at which the full content of the delta can be retrieved.
   * </pre>
   *
   * <code>bytes delta_dfs_hash = 1;</code>
   * @return The deltaDfsHash.
   */
  public com.google.protobuf.ByteString getDeltaDfsHash() {
    return deltaDfsHash_;
  }

  public static final int PREVIOUS_DELTA_DFS_HASH_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString previousDeltaDfsHash_;
  /**
   * <pre>
   * The DFS address for the content of the delta preceding this candidate.
   * </pre>
   *
   * <code>bytes previous_delta_dfs_hash = 2;</code>
   * @return The previousDeltaDfsHash.
   */
  public com.google.protobuf.ByteString getPreviousDeltaDfsHash() {
    return previousDeltaDfsHash_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!deltaDfsHash_.isEmpty()) {
      output.writeBytes(1, deltaDfsHash_);
    }
    if (!previousDeltaDfsHash_.isEmpty()) {
      output.writeBytes(2, previousDeltaDfsHash_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!deltaDfsHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, deltaDfsHash_);
    }
    if (!previousDeltaDfsHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, previousDeltaDfsHash_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Catalyst.Protocol.Wire.DeltaDfsHashBroadcast)) {
      return super.equals(obj);
    }
    Catalyst.Protocol.Wire.DeltaDfsHashBroadcast other = (Catalyst.Protocol.Wire.DeltaDfsHashBroadcast) obj;

    if (!getDeltaDfsHash()
        .equals(other.getDeltaDfsHash())) return false;
    if (!getPreviousDeltaDfsHash()
        .equals(other.getPreviousDeltaDfsHash())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DELTA_DFS_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getDeltaDfsHash().hashCode();
    hash = (37 * hash) + PREVIOUS_DELTA_DFS_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getPreviousDeltaDfsHash().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Catalyst.Protocol.Wire.DeltaDfsHashBroadcast prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code Catalyst.Protocol.Wire.DeltaDfsHashBroadcast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Catalyst.Protocol.Wire.DeltaDfsHashBroadcast)
      Catalyst.Protocol.Wire.DeltaDfsHashBroadcastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Catalyst.Protocol.Wire.Wire.internal_static_Catalyst_Protocol_Wire_DeltaDfsHashBroadcast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Catalyst.Protocol.Wire.Wire.internal_static_Catalyst_Protocol_Wire_DeltaDfsHashBroadcast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Catalyst.Protocol.Wire.DeltaDfsHashBroadcast.class, Catalyst.Protocol.Wire.DeltaDfsHashBroadcast.Builder.class);
    }

    // Construct using Catalyst.Protocol.Wire.DeltaDfsHashBroadcast.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      deltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;

      previousDeltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Catalyst.Protocol.Wire.Wire.internal_static_Catalyst_Protocol_Wire_DeltaDfsHashBroadcast_descriptor;
    }

    @java.lang.Override
    public Catalyst.Protocol.Wire.DeltaDfsHashBroadcast getDefaultInstanceForType() {
      return Catalyst.Protocol.Wire.DeltaDfsHashBroadcast.getDefaultInstance();
    }

    @java.lang.Override
    public Catalyst.Protocol.Wire.DeltaDfsHashBroadcast build() {
      Catalyst.Protocol.Wire.DeltaDfsHashBroadcast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Catalyst.Protocol.Wire.DeltaDfsHashBroadcast buildPartial() {
      Catalyst.Protocol.Wire.DeltaDfsHashBroadcast result = new Catalyst.Protocol.Wire.DeltaDfsHashBroadcast(this);
      result.deltaDfsHash_ = deltaDfsHash_;
      result.previousDeltaDfsHash_ = previousDeltaDfsHash_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Catalyst.Protocol.Wire.DeltaDfsHashBroadcast) {
        return mergeFrom((Catalyst.Protocol.Wire.DeltaDfsHashBroadcast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Catalyst.Protocol.Wire.DeltaDfsHashBroadcast other) {
      if (other == Catalyst.Protocol.Wire.DeltaDfsHashBroadcast.getDefaultInstance()) return this;
      if (other.getDeltaDfsHash() != com.google.protobuf.ByteString.EMPTY) {
        setDeltaDfsHash(other.getDeltaDfsHash());
      }
      if (other.getPreviousDeltaDfsHash() != com.google.protobuf.ByteString.EMPTY) {
        setPreviousDeltaDfsHash(other.getPreviousDeltaDfsHash());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Catalyst.Protocol.Wire.DeltaDfsHashBroadcast parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Catalyst.Protocol.Wire.DeltaDfsHashBroadcast) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString deltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The DFS address at which the full content of the delta can be retrieved.
     * </pre>
     *
     * <code>bytes delta_dfs_hash = 1;</code>
     * @return The deltaDfsHash.
     */
    public com.google.protobuf.ByteString getDeltaDfsHash() {
      return deltaDfsHash_;
    }
    /**
     * <pre>
     * The DFS address at which the full content of the delta can be retrieved.
     * </pre>
     *
     * <code>bytes delta_dfs_hash = 1;</code>
     * @param value The deltaDfsHash to set.
     * @return This builder for chaining.
     */
    public Builder setDeltaDfsHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deltaDfsHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The DFS address at which the full content of the delta can be retrieved.
     * </pre>
     *
     * <code>bytes delta_dfs_hash = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeltaDfsHash() {
      
      deltaDfsHash_ = getDefaultInstance().getDeltaDfsHash();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString previousDeltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The DFS address for the content of the delta preceding this candidate.
     * </pre>
     *
     * <code>bytes previous_delta_dfs_hash = 2;</code>
     * @return The previousDeltaDfsHash.
     */
    public com.google.protobuf.ByteString getPreviousDeltaDfsHash() {
      return previousDeltaDfsHash_;
    }
    /**
     * <pre>
     * The DFS address for the content of the delta preceding this candidate.
     * </pre>
     *
     * <code>bytes previous_delta_dfs_hash = 2;</code>
     * @param value The previousDeltaDfsHash to set.
     * @return This builder for chaining.
     */
    public Builder setPreviousDeltaDfsHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      previousDeltaDfsHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The DFS address for the content of the delta preceding this candidate.
     * </pre>
     *
     * <code>bytes previous_delta_dfs_hash = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPreviousDeltaDfsHash() {
      
      previousDeltaDfsHash_ = getDefaultInstance().getPreviousDeltaDfsHash();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Catalyst.Protocol.Wire.DeltaDfsHashBroadcast)
  }

  // @@protoc_insertion_point(class_scope:Catalyst.Protocol.Wire.DeltaDfsHashBroadcast)
  private static final Catalyst.Protocol.Wire.DeltaDfsHashBroadcast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Catalyst.Protocol.Wire.DeltaDfsHashBroadcast();
  }

  public static Catalyst.Protocol.Wire.DeltaDfsHashBroadcast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeltaDfsHashBroadcast>
      PARSER = new com.google.protobuf.AbstractParser<DeltaDfsHashBroadcast>() {
    @java.lang.Override
    public DeltaDfsHashBroadcast parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeltaDfsHashBroadcast(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeltaDfsHashBroadcast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeltaDfsHashBroadcast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public Catalyst.Protocol.Wire.DeltaDfsHashBroadcast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
