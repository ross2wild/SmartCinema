package CinemaProject.service1;

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
    comments = "Source: MovieControl.proto")
public final class MovieControlGrpc {

  private MovieControlGrpc() {}

  public static final String SERVICE_NAME = "CinemaProject.MovieControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CinemaProject.service1.PlayMovieRequest,
      CinemaProject.service1.PlayMovieResponse> getPlayMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayMovie",
      requestType = CinemaProject.service1.PlayMovieRequest.class,
      responseType = CinemaProject.service1.PlayMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CinemaProject.service1.PlayMovieRequest,
      CinemaProject.service1.PlayMovieResponse> getPlayMovieMethod() {
    io.grpc.MethodDescriptor<CinemaProject.service1.PlayMovieRequest, CinemaProject.service1.PlayMovieResponse> getPlayMovieMethod;
    if ((getPlayMovieMethod = MovieControlGrpc.getPlayMovieMethod) == null) {
      synchronized (MovieControlGrpc.class) {
        if ((getPlayMovieMethod = MovieControlGrpc.getPlayMovieMethod) == null) {
          MovieControlGrpc.getPlayMovieMethod = getPlayMovieMethod = 
              io.grpc.MethodDescriptor.<CinemaProject.service1.PlayMovieRequest, CinemaProject.service1.PlayMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaProject.MovieControl", "PlayMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service1.PlayMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service1.PlayMovieResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieControlMethodDescriptorSupplier("PlayMovie"))
                  .build();
          }
        }
     }
     return getPlayMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CinemaProject.service1.PauseMovieRequest,
      CinemaProject.service1.PauseMovieResponse> getPauseMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseMovie",
      requestType = CinemaProject.service1.PauseMovieRequest.class,
      responseType = CinemaProject.service1.PauseMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CinemaProject.service1.PauseMovieRequest,
      CinemaProject.service1.PauseMovieResponse> getPauseMovieMethod() {
    io.grpc.MethodDescriptor<CinemaProject.service1.PauseMovieRequest, CinemaProject.service1.PauseMovieResponse> getPauseMovieMethod;
    if ((getPauseMovieMethod = MovieControlGrpc.getPauseMovieMethod) == null) {
      synchronized (MovieControlGrpc.class) {
        if ((getPauseMovieMethod = MovieControlGrpc.getPauseMovieMethod) == null) {
          MovieControlGrpc.getPauseMovieMethod = getPauseMovieMethod = 
              io.grpc.MethodDescriptor.<CinemaProject.service1.PauseMovieRequest, CinemaProject.service1.PauseMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaProject.MovieControl", "PauseMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service1.PauseMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service1.PauseMovieResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieControlMethodDescriptorSupplier("PauseMovie"))
                  .build();
          }
        }
     }
     return getPauseMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CinemaProject.service1.MonitorPlaybackRequest,
      CinemaProject.service1.MonitorPlaybackResponse> getMonitorPlaybackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorPlayback",
      requestType = CinemaProject.service1.MonitorPlaybackRequest.class,
      responseType = CinemaProject.service1.MonitorPlaybackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CinemaProject.service1.MonitorPlaybackRequest,
      CinemaProject.service1.MonitorPlaybackResponse> getMonitorPlaybackMethod() {
    io.grpc.MethodDescriptor<CinemaProject.service1.MonitorPlaybackRequest, CinemaProject.service1.MonitorPlaybackResponse> getMonitorPlaybackMethod;
    if ((getMonitorPlaybackMethod = MovieControlGrpc.getMonitorPlaybackMethod) == null) {
      synchronized (MovieControlGrpc.class) {
        if ((getMonitorPlaybackMethod = MovieControlGrpc.getMonitorPlaybackMethod) == null) {
          MovieControlGrpc.getMonitorPlaybackMethod = getMonitorPlaybackMethod = 
              io.grpc.MethodDescriptor.<CinemaProject.service1.MonitorPlaybackRequest, CinemaProject.service1.MonitorPlaybackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaProject.MovieControl", "MonitorPlayback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service1.MonitorPlaybackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service1.MonitorPlaybackResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieControlMethodDescriptorSupplier("MonitorPlayback"))
                  .build();
          }
        }
     }
     return getMonitorPlaybackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieControlStub newStub(io.grpc.Channel channel) {
    return new MovieControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MovieControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MovieControlFutureStub(channel);
  }

  /**
   */
  public static abstract class MovieControlImplBase implements io.grpc.BindableService {

    /**
     */
    public void playMovie(CinemaProject.service1.PlayMovieRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service1.PlayMovieResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMovieMethod(), responseObserver);
    }

    /**
     */
    public void pauseMovie(CinemaProject.service1.PauseMovieRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service1.PauseMovieResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseMovieMethod(), responseObserver);
    }

    /**
     */
    public void monitorPlayback(CinemaProject.service1.MonitorPlaybackRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service1.MonitorPlaybackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMonitorPlaybackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayMovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CinemaProject.service1.PlayMovieRequest,
                CinemaProject.service1.PlayMovieResponse>(
                  this, METHODID_PLAY_MOVIE)))
          .addMethod(
            getPauseMovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CinemaProject.service1.PauseMovieRequest,
                CinemaProject.service1.PauseMovieResponse>(
                  this, METHODID_PAUSE_MOVIE)))
          .addMethod(
            getMonitorPlaybackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CinemaProject.service1.MonitorPlaybackRequest,
                CinemaProject.service1.MonitorPlaybackResponse>(
                  this, METHODID_MONITOR_PLAYBACK)))
          .build();
    }
  }

  /**
   */
  public static final class MovieControlStub extends io.grpc.stub.AbstractStub<MovieControlStub> {
    private MovieControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieControlStub(channel, callOptions);
    }

    /**
     */
    public void playMovie(CinemaProject.service1.PlayMovieRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service1.PlayMovieResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pauseMovie(CinemaProject.service1.PauseMovieRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service1.PauseMovieResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void monitorPlayback(CinemaProject.service1.MonitorPlaybackRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service1.MonitorPlaybackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMonitorPlaybackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MovieControlBlockingStub extends io.grpc.stub.AbstractStub<MovieControlBlockingStub> {
    private MovieControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieControlBlockingStub(channel, callOptions);
    }

    /**
     */
    public CinemaProject.service1.PlayMovieResponse playMovie(CinemaProject.service1.PlayMovieRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public CinemaProject.service1.PauseMovieResponse pauseMovie(CinemaProject.service1.PauseMovieRequest request) {
      return blockingUnaryCall(
          getChannel(), getPauseMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public CinemaProject.service1.MonitorPlaybackResponse monitorPlayback(CinemaProject.service1.MonitorPlaybackRequest request) {
      return blockingUnaryCall(
          getChannel(), getMonitorPlaybackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MovieControlFutureStub extends io.grpc.stub.AbstractStub<MovieControlFutureStub> {
    private MovieControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieControlFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CinemaProject.service1.PlayMovieResponse> playMovie(
        CinemaProject.service1.PlayMovieRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CinemaProject.service1.PauseMovieResponse> pauseMovie(
        CinemaProject.service1.PauseMovieRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CinemaProject.service1.MonitorPlaybackResponse> monitorPlayback(
        CinemaProject.service1.MonitorPlaybackRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMonitorPlaybackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY_MOVIE = 0;
  private static final int METHODID_PAUSE_MOVIE = 1;
  private static final int METHODID_MONITOR_PLAYBACK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MovieControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MovieControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY_MOVIE:
          serviceImpl.playMovie((CinemaProject.service1.PlayMovieRequest) request,
              (io.grpc.stub.StreamObserver<CinemaProject.service1.PlayMovieResponse>) responseObserver);
          break;
        case METHODID_PAUSE_MOVIE:
          serviceImpl.pauseMovie((CinemaProject.service1.PauseMovieRequest) request,
              (io.grpc.stub.StreamObserver<CinemaProject.service1.PauseMovieResponse>) responseObserver);
          break;
        case METHODID_MONITOR_PLAYBACK:
          serviceImpl.monitorPlayback((CinemaProject.service1.MonitorPlaybackRequest) request,
              (io.grpc.stub.StreamObserver<CinemaProject.service1.MonitorPlaybackResponse>) responseObserver);
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

  private static abstract class MovieControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CinemaProject.service1.Service1Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MovieControl");
    }
  }

  private static final class MovieControlFileDescriptorSupplier
      extends MovieControlBaseDescriptorSupplier {
    MovieControlFileDescriptorSupplier() {}
  }

  private static final class MovieControlMethodDescriptorSupplier
      extends MovieControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MovieControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (MovieControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieControlFileDescriptorSupplier())
              .addMethod(getPlayMovieMethod())
              .addMethod(getPauseMovieMethod())
              .addMethod(getMonitorPlaybackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
