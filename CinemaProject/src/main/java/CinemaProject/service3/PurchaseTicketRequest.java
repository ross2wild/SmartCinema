// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TicketingControl.proto

package CinemaProject.service3;

/**
 * Protobuf type {@code CinemaProject.PurchaseTicketRequest}
 */
public  final class PurchaseTicketRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CinemaProject.PurchaseTicketRequest)
    PurchaseTicketRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PurchaseTicketRequest.newBuilder() to construct.
  private PurchaseTicketRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PurchaseTicketRequest() {
    movieId_ = "";
    quantity_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PurchaseTicketRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            movieId_ = s;
            break;
          }
          case 16: {

            quantity_ = input.readInt32();
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
    return CinemaProject.service3.Service3Impl.internal_static_CinemaProject_PurchaseTicketRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return CinemaProject.service3.Service3Impl.internal_static_CinemaProject_PurchaseTicketRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CinemaProject.service3.PurchaseTicketRequest.class, CinemaProject.service3.PurchaseTicketRequest.Builder.class);
  }

  public static final int MOVIEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object movieId_;
  /**
   * <code>string movieId = 1;</code>
   */
  public java.lang.String getMovieId() {
    java.lang.Object ref = movieId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      movieId_ = s;
      return s;
    }
  }
  /**
   * <code>string movieId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMovieIdBytes() {
    java.lang.Object ref = movieId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      movieId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private int quantity_;
  /**
   * <code>int32 quantity = 2;</code>
   */
  public int getQuantity() {
    return quantity_;
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
    if (!getMovieIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, movieId_);
    }
    if (quantity_ != 0) {
      output.writeInt32(2, quantity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMovieIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, movieId_);
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, quantity_);
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
    if (!(obj instanceof CinemaProject.service3.PurchaseTicketRequest)) {
      return super.equals(obj);
    }
    CinemaProject.service3.PurchaseTicketRequest other = (CinemaProject.service3.PurchaseTicketRequest) obj;

    boolean result = true;
    result = result && getMovieId()
        .equals(other.getMovieId());
    result = result && (getQuantity()
        == other.getQuantity());
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
    hash = (37 * hash) + MOVIEID_FIELD_NUMBER;
    hash = (53 * hash) + getMovieId().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CinemaProject.service3.PurchaseTicketRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CinemaProject.service3.PurchaseTicketRequest parseFrom(
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
  public static Builder newBuilder(CinemaProject.service3.PurchaseTicketRequest prototype) {
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
   * Protobuf type {@code CinemaProject.PurchaseTicketRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CinemaProject.PurchaseTicketRequest)
      CinemaProject.service3.PurchaseTicketRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CinemaProject.service3.Service3Impl.internal_static_CinemaProject_PurchaseTicketRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CinemaProject.service3.Service3Impl.internal_static_CinemaProject_PurchaseTicketRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CinemaProject.service3.PurchaseTicketRequest.class, CinemaProject.service3.PurchaseTicketRequest.Builder.class);
    }

    // Construct using CinemaProject.service3.PurchaseTicketRequest.newBuilder()
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
      movieId_ = "";

      quantity_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return CinemaProject.service3.Service3Impl.internal_static_CinemaProject_PurchaseTicketRequest_descriptor;
    }

    @java.lang.Override
    public CinemaProject.service3.PurchaseTicketRequest getDefaultInstanceForType() {
      return CinemaProject.service3.PurchaseTicketRequest.getDefaultInstance();
    }

    @java.lang.Override
    public CinemaProject.service3.PurchaseTicketRequest build() {
      CinemaProject.service3.PurchaseTicketRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public CinemaProject.service3.PurchaseTicketRequest buildPartial() {
      CinemaProject.service3.PurchaseTicketRequest result = new CinemaProject.service3.PurchaseTicketRequest(this);
      result.movieId_ = movieId_;
      result.quantity_ = quantity_;
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
      if (other instanceof CinemaProject.service3.PurchaseTicketRequest) {
        return mergeFrom((CinemaProject.service3.PurchaseTicketRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CinemaProject.service3.PurchaseTicketRequest other) {
      if (other == CinemaProject.service3.PurchaseTicketRequest.getDefaultInstance()) return this;
      if (!other.getMovieId().isEmpty()) {
        movieId_ = other.movieId_;
        onChanged();
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
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
      CinemaProject.service3.PurchaseTicketRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (CinemaProject.service3.PurchaseTicketRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object movieId_ = "";
    /**
     * <code>string movieId = 1;</code>
     */
    public java.lang.String getMovieId() {
      java.lang.Object ref = movieId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        movieId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string movieId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMovieIdBytes() {
      java.lang.Object ref = movieId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        movieId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string movieId = 1;</code>
     */
    public Builder setMovieId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      movieId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string movieId = 1;</code>
     */
    public Builder clearMovieId() {
      
      movieId_ = getDefaultInstance().getMovieId();
      onChanged();
      return this;
    }
    /**
     * <code>string movieId = 1;</code>
     */
    public Builder setMovieIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      movieId_ = value;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 2;</code>
     */
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 2;</code>
     */
    public Builder setQuantity(int value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 2;</code>
     */
    public Builder clearQuantity() {
      
      quantity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:CinemaProject.PurchaseTicketRequest)
  }

  // @@protoc_insertion_point(class_scope:CinemaProject.PurchaseTicketRequest)
  private static final CinemaProject.service3.PurchaseTicketRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CinemaProject.service3.PurchaseTicketRequest();
  }

  public static CinemaProject.service3.PurchaseTicketRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PurchaseTicketRequest>
      PARSER = new com.google.protobuf.AbstractParser<PurchaseTicketRequest>() {
    @java.lang.Override
    public PurchaseTicketRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PurchaseTicketRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PurchaseTicketRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PurchaseTicketRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public CinemaProject.service3.PurchaseTicketRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

