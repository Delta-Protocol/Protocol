// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Transaction.proto

package Catalyst.Protocol.Transaction;

public final class Transaction {
  private Transaction() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Catalyst_Protocol_Transaction_PublicEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Catalyst_Protocol_Transaction_PublicEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Catalyst_Protocol_Transaction_ConfidentialEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Catalyst_Protocol_Transaction_ConfidentialEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Catalyst_Protocol_Transaction_CoinbaseEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Catalyst_Protocol_Transaction_CoinbaseEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Catalyst_Protocol_Transaction_RangeProof_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Catalyst_Protocol_Transaction_RangeProof_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021Transaction.proto\022\035Catalyst.Protocol.T" +
      "ransaction\032\022Cryptography.proto\032\037google/p" +
      "rotobuf/timestamp.proto\"\377\001\n\013PublicEntry\022" +
      "\030\n\020receiver_address\030\001 \001(\014\022\026\n\016sender_addr" +
      "ess\030\002 \001(\014\022\016\n\006amount\030\003 \001(\014\022\014\n\004data\030\004 \001(\014\022" +
      "-\n\ttimestamp\030\005 \001(\0132\032.google.protobuf.Tim" +
      "estamp\022\021\n\tgas_price\030\006 \001(\014\022\021\n\tgas_limit\030\007" +
      " \001(\004\022\r\n\005nonce\030\t \001(\004\022<\n\tsignature\030\n \001(\0132)" +
      ".Catalyst.Protocol.Cryptography.Signatur" +
      "e\"\321\001\n\021ConfidentialEntry\022\033\n\023receiver_publ" +
      "ic_key\030\001 \001(\014\022\031\n\021sender_public_key\030\002 \001(\014\022" +
      "\033\n\023pedersen_commitment\030\003 \001(\014\022>\n\013range_pr" +
      "oof\030\004 \001(\0132).Catalyst.Protocol.Transactio" +
      "n.RangeProof\022\030\n\020transaction_fees\030\005 \001(\014\022\r" +
      "\n\005nonce\030\006 \001(\004\"<\n\rCoinbaseEntry\022\033\n\023receiv" +
      "er_public_key\030\001 \001(\014\022\016\n\006amount\030\002 \001(\014\"\332\002\n\n" +
      "RangeProof\022\030\n\020value_commitment\030\001 \003(\014\022\026\n\016" +
      "bit_commitment\030\002 \001(\014\022*\n\"per_bit_blinding" +
      "_factor_commitment\030\003 \001(\014\022\032\n\022poly_commitm" +
      "ent_t1\030\004 \001(\014\022\032\n\022poly_commitment_t2\030\005 \001(\014" +
      "\022\032\n\022proof_of_share_tau\030\006 \001(\014\022\031\n\021proof_of" +
      "_share_mu\030\007 \001(\014\022&\n\036aggregated_vector_pol" +
      "ynomial_l\030\010 \003(\014\022&\n\036aggregated_vector_pol" +
      "ynomial_r\030\t \003(\014\022\021\n\ta_prime_0\030\n \001(\014\022\021\n\tb_" +
      "prime_0\030\013 \001(\014\022\t\n\001t\030\014 \001(\014*M\n\017TransactionT" +
      "ype\022\034\n\030TRANSACTION_TYPE_UNKNOWN\020\000\022\n\n\006PUB" +
      "LIC\020\001\022\020\n\014CONFIDENTIAL\020\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Catalyst.Protocol.Cryptography.Cryptography.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_Catalyst_Protocol_Transaction_PublicEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Catalyst_Protocol_Transaction_PublicEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Catalyst_Protocol_Transaction_PublicEntry_descriptor,
        new java.lang.String[] { "ReceiverAddress", "SenderAddress", "Amount", "Data", "Timestamp", "GasPrice", "GasLimit", "Nonce", "Signature", });
    internal_static_Catalyst_Protocol_Transaction_ConfidentialEntry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Catalyst_Protocol_Transaction_ConfidentialEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Catalyst_Protocol_Transaction_ConfidentialEntry_descriptor,
        new java.lang.String[] { "ReceiverPublicKey", "SenderPublicKey", "PedersenCommitment", "RangeProof", "TransactionFees", "Nonce", });
    internal_static_Catalyst_Protocol_Transaction_CoinbaseEntry_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Catalyst_Protocol_Transaction_CoinbaseEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Catalyst_Protocol_Transaction_CoinbaseEntry_descriptor,
        new java.lang.String[] { "ReceiverPublicKey", "Amount", });
    internal_static_Catalyst_Protocol_Transaction_RangeProof_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Catalyst_Protocol_Transaction_RangeProof_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Catalyst_Protocol_Transaction_RangeProof_descriptor,
        new java.lang.String[] { "ValueCommitment", "BitCommitment", "PerBitBlindingFactorCommitment", "PolyCommitmentT1", "PolyCommitmentT2", "ProofOfShareTau", "ProofOfShareMu", "AggregatedVectorPolynomialL", "AggregatedVectorPolynomialR", "APrime0", "BPrime0", "T", });
    Catalyst.Protocol.Cryptography.Cryptography.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
