// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Deltas.proto

package Catalyst.Protocol.Deltas;

/**
 * <pre>
 **
 * CandidateDeltaBroadcast
 * DeltaHash: The hash computed for the current delta produced by ProducerId.
 *	This is meant to be used when voting for most popular hashes.
 * PreviousDeltaDfsHash: The DFS address for the content of the delta preceding this candidate.
 * ProducerId: Identifier of the producer of the candidate.
 * </pre>
 *
 * Protobuf type {@code Catalyst.Protocol.Deltas.CandidateDeltaBroadcast}
 */
public  final class CandidateDeltaBroadcast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Catalyst.Protocol.Deltas.CandidateDeltaBroadcast)
    CandidateDeltaBroadcastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CandidateDeltaBroadcast.newBuilder() to construct.
  private CandidateDeltaBroadcast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CandidateDeltaBroadcast() {
    hash_ = com.google.protobuf.ByteString.EMPTY;
    previousDeltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CandidateDeltaBroadcast(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            hash_ = input.readBytes();
            break;
          }
          case 18: {
            Catalyst.Protocol.Common.Common.PeerId.Builder subBuilder = null;
            if (producerId_ != null) {
              subBuilder = producerId_.toBuilder();
            }
            producerId_ = input.readMessage(Catalyst.Protocol.Common.Common.PeerId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(producerId_);
              producerId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {

            previousDeltaDfsHash_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return Catalyst.Protocol.Deltas.Deltas.internal_static_Catalyst_Protocol_Deltas_CandidateDeltaBroadcast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Catalyst.Protocol.Deltas.Deltas.internal_static_Catalyst_Protocol_Deltas_CandidateDeltaBroadcast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Catalyst.Protocol.Deltas.CandidateDeltaBroadcast.class, Catalyst.Protocol.Deltas.CandidateDeltaBroadcast.Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString hash_;
  /**
   * <code>bytes Hash = 1;</code>
   */
  public com.google.protobuf.ByteString getHash() {
    return hash_;
  }

  public static final int PRODUCERID_FIELD_NUMBER = 2;
  private Catalyst.Protocol.Common.Common.PeerId producerId_;
  /**
   * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
   */
  public boolean hasProducerId() {
    return producerId_ != null;
  }
  /**
   * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
   */
  public Catalyst.Protocol.Common.Common.PeerId getProducerId() {
    return producerId_ == null ? Catalyst.Protocol.Common.Common.PeerId.getDefaultInstance() : producerId_;
  }
  /**
   * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
   */
  public Catalyst.Protocol.Common.Common.PeerIdOrBuilder getProducerIdOrBuilder() {
    return getProducerId();
  }

  public static final int PREVIOUSDELTADFSHASH_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString previousDeltaDfsHash_;
  /**
   * <code>bytes PreviousDeltaDfsHash = 3;</code>
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
    if (!hash_.isEmpty()) {
      output.writeBytes(1, hash_);
    }
    if (producerId_ != null) {
      output.writeMessage(2, getProducerId());
    }
    if (!previousDeltaDfsHash_.isEmpty()) {
      output.writeBytes(3, previousDeltaDfsHash_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!hash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, hash_);
    }
    if (producerId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProducerId());
    }
    if (!previousDeltaDfsHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, previousDeltaDfsHash_);
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
    if (!(obj instanceof Catalyst.Protocol.Deltas.CandidateDeltaBroadcast)) {
      return super.equals(obj);
    }
    Catalyst.Protocol.Deltas.CandidateDeltaBroadcast other = (Catalyst.Protocol.Deltas.CandidateDeltaBroadcast) obj;

    boolean result = true;
    result = result && getHash()
        .equals(other.getHash());
    result = result && (hasProducerId() == other.hasProducerId());
    if (hasProducerId()) {
      result = result && getProducerId()
          .equals(other.getProducerId());
    }
    result = result && getPreviousDeltaDfsHash()
        .equals(other.getPreviousDeltaDfsHash());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    if (hasProducerId()) {
      hash = (37 * hash) + PRODUCERID_FIELD_NUMBER;
      hash = (53 * hash) + getProducerId().hashCode();
    }
    hash = (37 * hash) + PREVIOUSDELTADFSHASH_FIELD_NUMBER;
    hash = (53 * hash) + getPreviousDeltaDfsHash().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parseFrom(
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
  public static Builder newBuilder(Catalyst.Protocol.Deltas.CandidateDeltaBroadcast prototype) {
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
   * <pre>
   **
   * CandidateDeltaBroadcast
   * DeltaHash: The hash computed for the current delta produced by ProducerId.
   *	This is meant to be used when voting for most popular hashes.
   * PreviousDeltaDfsHash: The DFS address for the content of the delta preceding this candidate.
   * ProducerId: Identifier of the producer of the candidate.
   * </pre>
   *
   * Protobuf type {@code Catalyst.Protocol.Deltas.CandidateDeltaBroadcast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Catalyst.Protocol.Deltas.CandidateDeltaBroadcast)
      Catalyst.Protocol.Deltas.CandidateDeltaBroadcastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Catalyst.Protocol.Deltas.Deltas.internal_static_Catalyst_Protocol_Deltas_CandidateDeltaBroadcast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Catalyst.Protocol.Deltas.Deltas.internal_static_Catalyst_Protocol_Deltas_CandidateDeltaBroadcast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Catalyst.Protocol.Deltas.CandidateDeltaBroadcast.class, Catalyst.Protocol.Deltas.CandidateDeltaBroadcast.Builder.class);
    }

    // Construct using Catalyst.Protocol.Deltas.CandidateDeltaBroadcast.newBuilder()
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
      hash_ = com.google.protobuf.ByteString.EMPTY;

      if (producerIdBuilder_ == null) {
        producerId_ = null;
      } else {
        producerId_ = null;
        producerIdBuilder_ = null;
      }
      previousDeltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Catalyst.Protocol.Deltas.Deltas.internal_static_Catalyst_Protocol_Deltas_CandidateDeltaBroadcast_descriptor;
    }

    @java.lang.Override
    public Catalyst.Protocol.Deltas.CandidateDeltaBroadcast getDefaultInstanceForType() {
      return Catalyst.Protocol.Deltas.CandidateDeltaBroadcast.getDefaultInstance();
    }

    @java.lang.Override
    public Catalyst.Protocol.Deltas.CandidateDeltaBroadcast build() {
      Catalyst.Protocol.Deltas.CandidateDeltaBroadcast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Catalyst.Protocol.Deltas.CandidateDeltaBroadcast buildPartial() {
      Catalyst.Protocol.Deltas.CandidateDeltaBroadcast result = new Catalyst.Protocol.Deltas.CandidateDeltaBroadcast(this);
      result.hash_ = hash_;
      if (producerIdBuilder_ == null) {
        result.producerId_ = producerId_;
      } else {
        result.producerId_ = producerIdBuilder_.build();
      }
      result.previousDeltaDfsHash_ = previousDeltaDfsHash_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Catalyst.Protocol.Deltas.CandidateDeltaBroadcast) {
        return mergeFrom((Catalyst.Protocol.Deltas.CandidateDeltaBroadcast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Catalyst.Protocol.Deltas.CandidateDeltaBroadcast other) {
      if (other == Catalyst.Protocol.Deltas.CandidateDeltaBroadcast.getDefaultInstance()) return this;
      if (other.getHash() != com.google.protobuf.ByteString.EMPTY) {
        setHash(other.getHash());
      }
      if (other.hasProducerId()) {
        mergeProducerId(other.getProducerId());
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
      Catalyst.Protocol.Deltas.CandidateDeltaBroadcast parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Catalyst.Protocol.Deltas.CandidateDeltaBroadcast) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes Hash = 1;</code>
     */
    public com.google.protobuf.ByteString getHash() {
      return hash_;
    }
    /**
     * <code>bytes Hash = 1;</code>
     */
    public Builder setHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes Hash = 1;</code>
     */
    public Builder clearHash() {
      
      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }

    private Catalyst.Protocol.Common.Common.PeerId producerId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        Catalyst.Protocol.Common.Common.PeerId, Catalyst.Protocol.Common.Common.PeerId.Builder, Catalyst.Protocol.Common.Common.PeerIdOrBuilder> producerIdBuilder_;
    /**
     * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
     */
    public boolean hasProducerId() {
      return producerIdBuilder_ != null || producerId_ != null;
    }
    /**
     * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
     */
    public Catalyst.Protocol.Common.Common.PeerId getProducerId() {
      if (producerIdBuilder_ == null) {
        return producerId_ == null ? Catalyst.Protocol.Common.Common.PeerId.getDefaultInstance() : producerId_;
      } else {
        return producerIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
     */
    public Builder setProducerId(Catalyst.Protocol.Common.Common.PeerId value) {
      if (producerIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        producerId_ = value;
        onChanged();
      } else {
        producerIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
     */
    public Builder setProducerId(
        Catalyst.Protocol.Common.Common.PeerId.Builder builderForValue) {
      if (producerIdBuilder_ == null) {
        producerId_ = builderForValue.build();
        onChanged();
      } else {
        producerIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
     */
    public Builder mergeProducerId(Catalyst.Protocol.Common.Common.PeerId value) {
      if (producerIdBuilder_ == null) {
        if (producerId_ != null) {
          producerId_ =
            Catalyst.Protocol.Common.Common.PeerId.newBuilder(producerId_).mergeFrom(value).buildPartial();
        } else {
          producerId_ = value;
        }
        onChanged();
      } else {
        producerIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
     */
    public Builder clearProducerId() {
      if (producerIdBuilder_ == null) {
        producerId_ = null;
        onChanged();
      } else {
        producerId_ = null;
        producerIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
     */
    public Catalyst.Protocol.Common.Common.PeerId.Builder getProducerIdBuilder() {
      
      onChanged();
      return getProducerIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
     */
    public Catalyst.Protocol.Common.Common.PeerIdOrBuilder getProducerIdOrBuilder() {
      if (producerIdBuilder_ != null) {
        return producerIdBuilder_.getMessageOrBuilder();
      } else {
        return producerId_ == null ?
            Catalyst.Protocol.Common.Common.PeerId.getDefaultInstance() : producerId_;
      }
    }
    /**
     * <code>.Catalyst.Protocol.Common.PeerId ProducerId = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Catalyst.Protocol.Common.Common.PeerId, Catalyst.Protocol.Common.Common.PeerId.Builder, Catalyst.Protocol.Common.Common.PeerIdOrBuilder> 
        getProducerIdFieldBuilder() {
      if (producerIdBuilder_ == null) {
        producerIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Catalyst.Protocol.Common.Common.PeerId, Catalyst.Protocol.Common.Common.PeerId.Builder, Catalyst.Protocol.Common.Common.PeerIdOrBuilder>(
                getProducerId(),
                getParentForChildren(),
                isClean());
        producerId_ = null;
      }
      return producerIdBuilder_;
    }

    private com.google.protobuf.ByteString previousDeltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes PreviousDeltaDfsHash = 3;</code>
     */
    public com.google.protobuf.ByteString getPreviousDeltaDfsHash() {
      return previousDeltaDfsHash_;
    }
    /**
     * <code>bytes PreviousDeltaDfsHash = 3;</code>
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
     * <code>bytes PreviousDeltaDfsHash = 3;</code>
     */
    public Builder clearPreviousDeltaDfsHash() {
      
      previousDeltaDfsHash_ = getDefaultInstance().getPreviousDeltaDfsHash();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Catalyst.Protocol.Deltas.CandidateDeltaBroadcast)
  }

  // @@protoc_insertion_point(class_scope:Catalyst.Protocol.Deltas.CandidateDeltaBroadcast)
  private static final Catalyst.Protocol.Deltas.CandidateDeltaBroadcast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Catalyst.Protocol.Deltas.CandidateDeltaBroadcast();
  }

  public static Catalyst.Protocol.Deltas.CandidateDeltaBroadcast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CandidateDeltaBroadcast>
      PARSER = new com.google.protobuf.AbstractParser<CandidateDeltaBroadcast>() {
    @java.lang.Override
    public CandidateDeltaBroadcast parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CandidateDeltaBroadcast(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CandidateDeltaBroadcast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CandidateDeltaBroadcast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public Catalyst.Protocol.Deltas.CandidateDeltaBroadcast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
