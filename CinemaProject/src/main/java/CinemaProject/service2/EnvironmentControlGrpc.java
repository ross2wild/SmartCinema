package CinemaProject.service2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: EnvironmentControl.proto")
public final class EnvironmentControlGrpc {

  private EnvironmentControlGrpc() {}

  public static final String SERVICE_NAME = "CinemaProject.EnvironmentControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CinemaProject.service2.SetTemperatureRequest,
      CinemaProject.service2.SetTemperatureResponse> getSetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTemperature",
      requestType = CinemaProject.service2.SetTemperatureRequest.class,
      responseType = CinemaProject.service2.SetTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CinemaProject.service2.SetTemperatureRequest,
      CinemaProject.service2.SetTemperatureResponse> getSetTemperatureMethod() {
    io.grpc.MethodDescriptor<CinemaProject.service2.SetTemperatureRequest, CinemaProject.service2.SetTemperatureResponse> getSetTemperatureMethod;
    if ((getSetTemperatureMethod = EnvironmentControlGrpc.getSetTemperatureMethod) == null) {
      synchronized (EnvironmentControlGrpc.class) {
        if ((getSetTemperatureMethod = EnvironmentControlGrpc.getSetTemperatureMethod) == null) {
          EnvironmentControlGrpc.getSetTemperatureMethod = getSetTemperatureMethod = 
              io.grpc.MethodDescriptor.<CinemaProject.service2.SetTemperatureRequest, CinemaProject.service2.SetTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaProject.EnvironmentControl", "SetTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service2.SetTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service2.SetTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentControlMethodDescriptorSupplier("SetTemperature"))
                  .build();
          }
        }
     }
     return getSetTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CinemaProject.service2.SetVolumeRequest,
      CinemaProject.service2.SetVolumeResponse> getSetVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetVolume",
      requestType = CinemaProject.service2.SetVolumeRequest.class,
      responseType = CinemaProject.service2.SetVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CinemaProject.service2.SetVolumeRequest,
      CinemaProject.service2.SetVolumeResponse> getSetVolumeMethod() {
    io.grpc.MethodDescriptor<CinemaProject.service2.SetVolumeRequest, CinemaProject.service2.SetVolumeResponse> getSetVolumeMethod;
    if ((getSetVolumeMethod = EnvironmentControlGrpc.getSetVolumeMethod) == null) {
      synchronized (EnvironmentControlGrpc.class) {
        if ((getSetVolumeMethod = EnvironmentControlGrpc.getSetVolumeMethod) == null) {
          EnvironmentControlGrpc.getSetVolumeMethod = getSetVolumeMethod = 
              io.grpc.MethodDescriptor.<CinemaProject.service2.SetVolumeRequest, CinemaProject.service2.SetVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaProject.EnvironmentControl", "SetVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service2.SetVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service2.SetVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentControlMethodDescriptorSupplier("SetVolume"))
                  .build();
          }
        }
     }
     return getSetVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CinemaProject.service2.SetLightingRequest,
      CinemaProject.service2.SetLightingResponse> getSetLightingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetLighting",
      requestType = CinemaProject.service2.SetLightingRequest.class,
      responseType = CinemaProject.service2.SetLightingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CinemaProject.service2.SetLightingRequest,
      CinemaProject.service2.SetLightingResponse> getSetLightingMethod() {
    io.grpc.MethodDescriptor<CinemaProject.service2.SetLightingRequest, CinemaProject.service2.SetLightingResponse> getSetLightingMethod;
    if ((getSetLightingMethod = EnvironmentControlGrpc.getSetLightingMethod) == null) {
      synchronized (EnvironmentControlGrpc.class) {
        if ((getSetLightingMethod = EnvironmentControlGrpc.getSetLightingMethod) == null) {
          EnvironmentControlGrpc.getSetLightingMethod = getSetLightingMethod = 
              io.grpc.MethodDescriptor.<CinemaProject.service2.SetLightingRequest, CinemaProject.service2.SetLightingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaProject.EnvironmentControl", "SetLighting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service2.SetLightingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service2.SetLightingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentControlMethodDescriptorSupplier("SetLighting"))
                  .build();
          }
        }
     }
     return getSetLightingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnvironmentControlStub newStub(io.grpc.Channel channel) {
    return new EnvironmentControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnvironmentControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EnvironmentControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnvironmentControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EnvironmentControlFutureStub(channel);
  }

  /**
   */
  public static abstract class EnvironmentControlImplBase implements io.grpc.BindableService {

    /**
     */
    public void setTemperature(CinemaProject.service2.SetTemperatureRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service2.SetTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTemperatureMethod(), responseObserver);
    }

    /**
     */
    public void setVolume(CinemaProject.service2.SetVolumeRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service2.SetVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetVolumeMethod(), responseObserver);
    }

    /**
     */
    public void setLighting(CinemaProject.service2.SetLightingRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service2.SetLightingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetLightingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CinemaProject.service2.SetTemperatureRequest,
                CinemaProject.service2.SetTemperatureResponse>(
                  this, METHODID_SET_TEMPERATURE)))
          .addMethod(
            getSetVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CinemaProject.service2.SetVolumeRequest,
                CinemaProject.service2.SetVolumeResponse>(
                  this, METHODID_SET_VOLUME)))
          .addMethod(
            getSetLightingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CinemaProject.service2.SetLightingRequest,
                CinemaProject.service2.SetLightingResponse>(
                  this, METHODID_SET_LIGHTING)))
          .build();
    }
  }

  /**
   */
  public static final class EnvironmentControlStub extends io.grpc.stub.AbstractStub<EnvironmentControlStub> {
    private EnvironmentControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentControlStub(channel, callOptions);
    }

    /**
     */
    public void setTemperature(CinemaProject.service2.SetTemperatureRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service2.SetTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setVolume(CinemaProject.service2.SetVolumeRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service2.SetVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setLighting(CinemaProject.service2.SetLightingRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service2.SetLightingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetLightingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EnvironmentControlBlockingStub extends io.grpc.stub.AbstractStub<EnvironmentControlBlockingStub> {
    private EnvironmentControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentControlBlockingStub(channel, callOptions);
    }

    /**
     */
    public CinemaProject.service2.SetTemperatureResponse setTemperature(CinemaProject.service2.SetTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTemperatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public CinemaProject.service2.SetVolumeResponse setVolume(CinemaProject.service2.SetVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public CinemaProject.service2.SetLightingResponse setLighting(CinemaProject.service2.SetLightingRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetLightingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EnvironmentControlFutureStub extends io.grpc.stub.AbstractStub<EnvironmentControlFutureStub> {
    private EnvironmentControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentControlFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CinemaProject.service2.SetTemperatureResponse> setTemperature(
        CinemaProject.service2.SetTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTemperatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CinemaProject.service2.SetVolumeResponse> setVolume(
        CinemaProject.service2.SetVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CinemaProject.service2.SetLightingResponse> setLighting(
        CinemaProject.service2.SetLightingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetLightingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_TEMPERATURE = 0;
  private static final int METHODID_SET_VOLUME = 1;
  private static final int METHODID_SET_LIGHTING = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnvironmentControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnvironmentControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_TEMPERATURE:
          serviceImpl.setTemperature((CinemaProject.service2.SetTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<CinemaProject.service2.SetTemperatureResponse>) responseObserver);
          break;
        case METHODID_SET_VOLUME:
          serviceImpl.setVolume((CinemaProject.service2.SetVolumeRequest) request,
              (io.grpc.stub.StreamObserver<CinemaProject.service2.SetVolumeResponse>) responseObserver);
          break;
        case METHODID_SET_LIGHTING:
          serviceImpl.setLighting((CinemaProject.service2.SetLightingRequest) request,
              (io.grpc.stub.StreamObserver<CinemaProject.service2.SetLightingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EnvironmentControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnvironmentControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CinemaProject.service2.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnvironmentControl");
    }
  }

  private static final class EnvironmentControlFileDescriptorSupplier
      extends EnvironmentControlBaseDescriptorSupplier {
    EnvironmentControlFileDescriptorSupplier() {}
  }

  private static final class EnvironmentControlMethodDescriptorSupplier
      extends EnvironmentControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnvironmentControlMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EnvironmentControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnvironmentControlFileDescriptorSupplier())
              .addMethod(getSetTemperatureMethod())
              .addMethod(getSetVolumeMethod())
              .addMethod(getSetLightingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
