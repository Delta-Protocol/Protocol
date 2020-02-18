// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Peer.proto

package Catalyst.Protocol.Peer;

public final class Peer {
  private Peer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Catalyst_Protocol_Peer_PeerId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Catalyst_Protocol_Peer_PeerId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Catalyst_Protocol_Peer_PeerInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Catalyst_Protocol_Peer_PeerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nPeer.proto\022\026Catalyst.Protocol.Peer\032\037go" +
      "ogle/protobuf/timestamp.proto\032\036google/pr" +
      "otobuf/duration.proto\"6\n\006PeerId\022\n\n\002ip\030\001 " +
      "\001(\014\022\014\n\004port\030\002 \001(\r\022\022\n\npublic_key\030\003 \001(\014\"\272\002" +
      "\n\010PeerInfo\022/\n\007peer_id\030\001 \001(\0132\036.Catalyst.P" +
      "rotocol.Peer.PeerId\022\022\n\nreputation\030\002 \001(\021\022" +
      "\026\n\016is_blacklisted\030\003 \001(\010\022\026\n\016is_unreachabl" +
      "e\030\004 \001(\010\022/\n\014inactive_for\030\005 \001(\0132\031.google.p" +
      "rotobuf.Duration\022-\n\tlast_seen\030\006 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\022,\n\010modified\030\007 \001(" +
      "\0132\032.google.protobuf.Timestamp\022+\n\007created" +
      "\030\010 \001(\0132\032.google.protobuf.TimestampB\002P\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_Catalyst_Protocol_Peer_PeerId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Catalyst_Protocol_Peer_PeerId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Catalyst_Protocol_Peer_PeerId_descriptor,
        new java.lang.String[] { "Ip", "Port", "PublicKey", });
    internal_static_Catalyst_Protocol_Peer_PeerInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Catalyst_Protocol_Peer_PeerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Catalyst_Protocol_Peer_PeerInfo_descriptor,
        new java.lang.String[] { "PeerId", "Reputation", "IsBlacklisted", "IsUnreachable", "InactiveFor", "LastSeen", "Modified", "Created", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
