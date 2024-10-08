// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MovieControl.proto

package CinemaProject.service1;

/**
 * Protobuf type {@code CinemaProject.PauseMovieRequest}
 */
public  final class PauseMovieRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CinemaProject.PauseMovieRequest)
    PauseMovieRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PauseMovieRequest.newBuilder() to construct.
  private PauseMovieRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PauseMovieRequest() {
    screenId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PauseMovieRequest(
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
          case 8: {

            screenId_ = input.readInt32();
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
    return CinemaProject.service1.Service1Impl.internal_static_CinemaProject_PauseMovieRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return CinemaProject.service1.Service1Impl.internal_static_CinemaProject_PauseMovieRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CinemaProject.service1.PauseMovieRequest.class, CinemaProject.service1.PauseMovieRequest.Builder.class);
  }

  public static final int SCREENID_FIELD_NUMBER = 1;
  private int screenId_;
  /**
   * <code>int32 screenId = 1;</code>
   */
  public int getScreenId() {
    return screenId_;
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
    if (screenId_ != 0) {
      output.writeInt32(1, screenId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (screenId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, screenId_);
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
    if (!(obj instanceof CinemaProject.service1.PauseMovieRequest)) {
      return super.equals(obj);
    }
    CinemaProject.service1.PauseMovieRequest other = (CinemaProject.service1.PauseMovieRequest) obj;

    boolean result = true;
    result = result && (getScreenId()
        == other.getScreenId());
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
    hash = (37 * hash) + SCREENID_FIELD_NUMBER;
    hash = (53 * hash) + getScreenId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CinemaProject.service1.PauseMovieRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CinemaProject.service1.PauseMovieRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CinemaProject.service1.PauseMovieRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CinemaProject.service1.PauseMovieRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CinemaProject.service1.PauseMovieRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CinemaProject.service1.PauseMovieRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CinemaProject.service1.PauseMovieRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CinemaProject.service1.PauseMovieRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CinemaProject.service1.PauseMovieRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CinemaProject.service1.PauseMovieRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CinemaProject.service1.PauseMovieRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CinemaProject.service1.PauseMovieRequest parseFrom(
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
  public static Builder newBuilder(CinemaProject.service1.PauseMovieRequest prototype) {
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
   * Protobuf type {@code CinemaProject.PauseMovieRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CinemaProject.PauseMovieRequest)
      CinemaProject.service1.PauseMovieRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CinemaProject.service1.Service1Impl.internal_static_CinemaProject_PauseMovieRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CinemaProject.service1.Service1Impl.internal_static_CinemaProject_PauseMovieRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CinemaProject.service1.PauseMovieRequest.class, CinemaProject.service1.PauseMovieRequest.Builder.class);
    }

    // Construct using CinemaProject.service1.PauseMovieRequest.newBuilder()
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
      screenId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return CinemaProject.service1.Service1Impl.internal_static_CinemaProject_PauseMovieRequest_descriptor;
    }

    @java.lang.Override
    public CinemaProject.service1.PauseMovieRequest getDefaultInstanceForType() {
      return CinemaProject.service1.PauseMovieRequest.getDefaultInstance();
    }

    @java.lang.Override
    public CinemaProject.service1.PauseMovieRequest build() {
      CinemaProject.service1.PauseMovieRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public CinemaProject.service1.PauseMovieRequest buildPartial() {
      CinemaProject.service1.PauseMovieRequest result = new CinemaProject.service1.PauseMovieRequest(this);
      result.screenId_ = screenId_;
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
      if (other instanceof CinemaProject.service1.PauseMovieRequest) {
        return mergeFrom((CinemaProject.service1.PauseMovieRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CinemaProject.service1.PauseMovieRequest other) {
      if (other == CinemaProject.service1.PauseMovieRequest.getDefaultInstance()) return this;
      if (other.getScreenId() != 0) {
        setScreenId(other.getScreenId());
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
      CinemaProject.service1.PauseMovieRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (CinemaProject.service1.PauseMovieRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int screenId_ ;
    /**
     * <code>int32 screenId = 1;</code>
     */
    public int getScreenId() {
      return screenId_;
    }
    /**
     * <code>int32 screenId = 1;</code>
     */
    public Builder setScreenId(int value) {
      
      screenId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 screenId = 1;</code>
     */
    public Builder clearScreenId() {
      
      screenId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:CinemaProject.PauseMovieRequest)
  }

  // @@protoc_insertion_point(class_scope:CinemaProject.PauseMovieRequest)
  private static final CinemaProject.service1.PauseMovieRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CinemaProject.service1.PauseMovieRequest();
  }

  public static CinemaProject.service1.PauseMovieRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PauseMovieRequest>
      PARSER = new com.google.protobuf.AbstractParser<PauseMovieRequest>() {
    @java.lang.Override
    public PauseMovieRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PauseMovieRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PauseMovieRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PauseMovieRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public CinemaProject.service1.PauseMovieRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

