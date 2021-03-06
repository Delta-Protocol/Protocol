// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IPPN.proto

package Catalyst.Protocol.IPPN;

/**
 * Protobuf type {@code Catalyst.Protocol.IPPN.DeltaHistoryRequest}
 */
public  final class DeltaHistoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Catalyst.Protocol.IPPN.DeltaHistoryRequest)
    DeltaHistoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeltaHistoryRequest.newBuilder() to construct.
  private DeltaHistoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeltaHistoryRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeltaHistoryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeltaHistoryRequest(
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
          case 8: {

            range_ = input.readUInt32();
            break;
          }
          case 16: {

            height_ = input.readUInt32();
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
    return Catalyst.Protocol.IPPN.IPPN.internal_static_Catalyst_Protocol_IPPN_DeltaHistoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Catalyst.Protocol.IPPN.IPPN.internal_static_Catalyst_Protocol_IPPN_DeltaHistoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Catalyst.Protocol.IPPN.DeltaHistoryRequest.class, Catalyst.Protocol.IPPN.DeltaHistoryRequest.Builder.class);
  }

  public static final int RANGE_FIELD_NUMBER = 1;
  private int range_;
  /**
   * <pre>
   * The number of deltas CIDs a node requests.
   * </pre>
   *
   * <code>uint32 range = 1;</code>
   * @return The range.
   */
  public int getRange() {
    return range_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private int height_;
  /**
   * <pre>
   * The given height the node wants the range from.
   * </pre>
   *
   * <code>uint32 height = 2;</code>
   * @return The height.
   */
  public int getHeight() {
    return height_;
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
    if (range_ != 0) {
      output.writeUInt32(1, range_);
    }
    if (height_ != 0) {
      output.writeUInt32(2, height_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (range_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, range_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, height_);
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
    if (!(obj instanceof Catalyst.Protocol.IPPN.DeltaHistoryRequest)) {
      return super.equals(obj);
    }
    Catalyst.Protocol.IPPN.DeltaHistoryRequest other = (Catalyst.Protocol.IPPN.DeltaHistoryRequest) obj;

    if (getRange()
        != other.getRange()) return false;
    if (getHeight()
        != other.getHeight()) return false;
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
    hash = (37 * hash) + RANGE_FIELD_NUMBER;
    hash = (53 * hash) + getRange();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest parseFrom(
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
  public static Builder newBuilder(Catalyst.Protocol.IPPN.DeltaHistoryRequest prototype) {
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
   * Protobuf type {@code Catalyst.Protocol.IPPN.DeltaHistoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Catalyst.Protocol.IPPN.DeltaHistoryRequest)
      Catalyst.Protocol.IPPN.DeltaHistoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Catalyst.Protocol.IPPN.IPPN.internal_static_Catalyst_Protocol_IPPN_DeltaHistoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Catalyst.Protocol.IPPN.IPPN.internal_static_Catalyst_Protocol_IPPN_DeltaHistoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Catalyst.Protocol.IPPN.DeltaHistoryRequest.class, Catalyst.Protocol.IPPN.DeltaHistoryRequest.Builder.class);
    }

    // Construct using Catalyst.Protocol.IPPN.DeltaHistoryRequest.newBuilder()
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
      range_ = 0;

      height_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Catalyst.Protocol.IPPN.IPPN.internal_static_Catalyst_Protocol_IPPN_DeltaHistoryRequest_descriptor;
    }

    @java.lang.Override
    public Catalyst.Protocol.IPPN.DeltaHistoryRequest getDefaultInstanceForType() {
      return Catalyst.Protocol.IPPN.DeltaHistoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public Catalyst.Protocol.IPPN.DeltaHistoryRequest build() {
      Catalyst.Protocol.IPPN.DeltaHistoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Catalyst.Protocol.IPPN.DeltaHistoryRequest buildPartial() {
      Catalyst.Protocol.IPPN.DeltaHistoryRequest result = new Catalyst.Protocol.IPPN.DeltaHistoryRequest(this);
      result.range_ = range_;
      result.height_ = height_;
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
      if (other instanceof Catalyst.Protocol.IPPN.DeltaHistoryRequest) {
        return mergeFrom((Catalyst.Protocol.IPPN.DeltaHistoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Catalyst.Protocol.IPPN.DeltaHistoryRequest other) {
      if (other == Catalyst.Protocol.IPPN.DeltaHistoryRequest.getDefaultInstance()) return this;
      if (other.getRange() != 0) {
        setRange(other.getRange());
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
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
      Catalyst.Protocol.IPPN.DeltaHistoryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Catalyst.Protocol.IPPN.DeltaHistoryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int range_ ;
    /**
     * <pre>
     * The number of deltas CIDs a node requests.
     * </pre>
     *
     * <code>uint32 range = 1;</code>
     * @return The range.
     */
    public int getRange() {
      return range_;
    }
    /**
     * <pre>
     * The number of deltas CIDs a node requests.
     * </pre>
     *
     * <code>uint32 range = 1;</code>
     * @param value The range to set.
     * @return This builder for chaining.
     */
    public Builder setRange(int value) {
      
      range_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of deltas CIDs a node requests.
     * </pre>
     *
     * <code>uint32 range = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRange() {
      
      range_ = 0;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <pre>
     * The given height the node wants the range from.
     * </pre>
     *
     * <code>uint32 height = 2;</code>
     * @return The height.
     */
    public int getHeight() {
      return height_;
    }
    /**
     * <pre>
     * The given height the node wants the range from.
     * </pre>
     *
     * <code>uint32 height = 2;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The given height the node wants the range from.
     * </pre>
     *
     * <code>uint32 height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Catalyst.Protocol.IPPN.DeltaHistoryRequest)
  }

  // @@protoc_insertion_point(class_scope:Catalyst.Protocol.IPPN.DeltaHistoryRequest)
  private static final Catalyst.Protocol.IPPN.DeltaHistoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Catalyst.Protocol.IPPN.DeltaHistoryRequest();
  }

  public static Catalyst.Protocol.IPPN.DeltaHistoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeltaHistoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeltaHistoryRequest>() {
    @java.lang.Override
    public DeltaHistoryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeltaHistoryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeltaHistoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeltaHistoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public Catalyst.Protocol.IPPN.DeltaHistoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

