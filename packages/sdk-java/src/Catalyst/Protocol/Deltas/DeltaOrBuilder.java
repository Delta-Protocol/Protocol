// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Deltas.proto

package Catalyst.Protocol.Deltas;

public interface DeltaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Catalyst.Protocol.Deltas.Delta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *  address for the content of the previous delta on the DFS
   * </pre>
   *
   * <code>bytes previous_delta_dfs_hash = 1;</code>
   * @return The previousDeltaDfsHash.
   */
  com.google.protobuf.ByteString getPreviousDeltaDfsHash();

  /**
   * <code>bytes merkle_root = 2;</code>
   * @return The merkleRoot.
   */
  com.google.protobuf.ByteString getMerkleRoot();

  /**
   * <pre>
   * proof of delegated authority for active wokers
   * </pre>
   *
   * <code>bytes merkle_poda = 3;</code>
   * @return The merklePoda.
   */
  com.google.protobuf.ByteString getMerklePoda();

  /**
   * <code>.google.protobuf.Timestamp time_stamp = 4;</code>
   * @return Whether the timeStamp field is set.
   */
  boolean hasTimeStamp();
  /**
   * <code>.google.protobuf.Timestamp time_stamp = 4;</code>
   * @return The timeStamp.
   */
  com.google.protobuf.Timestamp getTimeStamp();
  /**
   * <code>.google.protobuf.Timestamp time_stamp = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeStampOrBuilder();

  /**
   * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry public_entries = 5;</code>
   */
  java.util.List<Catalyst.Protocol.Transaction.PublicEntry> 
      getPublicEntriesList();
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry public_entries = 5;</code>
   */
  Catalyst.Protocol.Transaction.PublicEntry getPublicEntries(int index);
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry public_entries = 5;</code>
   */
  int getPublicEntriesCount();
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry public_entries = 5;</code>
   */
  java.util.List<? extends Catalyst.Protocol.Transaction.PublicEntryOrBuilder> 
      getPublicEntriesOrBuilderList();
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry public_entries = 5;</code>
   */
  Catalyst.Protocol.Transaction.PublicEntryOrBuilder getPublicEntriesOrBuilder(
      int index);

  /**
   * <code>repeated .Catalyst.Protocol.Transaction.ConfidentialEntry confidential_entries = 6;</code>
   */
  java.util.List<Catalyst.Protocol.Transaction.ConfidentialEntry> 
      getConfidentialEntriesList();
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.ConfidentialEntry confidential_entries = 6;</code>
   */
  Catalyst.Protocol.Transaction.ConfidentialEntry getConfidentialEntries(int index);
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.ConfidentialEntry confidential_entries = 6;</code>
   */
  int getConfidentialEntriesCount();
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.ConfidentialEntry confidential_entries = 6;</code>
   */
  java.util.List<? extends Catalyst.Protocol.Transaction.ConfidentialEntryOrBuilder> 
      getConfidentialEntriesOrBuilderList();
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.ConfidentialEntry confidential_entries = 6;</code>
   */
  Catalyst.Protocol.Transaction.ConfidentialEntryOrBuilder getConfidentialEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * one per active worker
   * </pre>
   *
   * <code>repeated .Catalyst.Protocol.Transaction.CoinbaseEntry coinbase_entries = 7;</code>
   */
  java.util.List<Catalyst.Protocol.Transaction.CoinbaseEntry> 
      getCoinbaseEntriesList();
  /**
   * <pre>
   * one per active worker
   * </pre>
   *
   * <code>repeated .Catalyst.Protocol.Transaction.CoinbaseEntry coinbase_entries = 7;</code>
   */
  Catalyst.Protocol.Transaction.CoinbaseEntry getCoinbaseEntries(int index);
  /**
   * <pre>
   * one per active worker
   * </pre>
   *
   * <code>repeated .Catalyst.Protocol.Transaction.CoinbaseEntry coinbase_entries = 7;</code>
   */
  int getCoinbaseEntriesCount();
  /**
   * <pre>
   * one per active worker
   * </pre>
   *
   * <code>repeated .Catalyst.Protocol.Transaction.CoinbaseEntry coinbase_entries = 7;</code>
   */
  java.util.List<? extends Catalyst.Protocol.Transaction.CoinbaseEntryOrBuilder> 
      getCoinbaseEntriesOrBuilderList();
  /**
   * <pre>
   * one per active worker
   * </pre>
   *
   * <code>repeated .Catalyst.Protocol.Transaction.CoinbaseEntry coinbase_entries = 7;</code>
   */
  Catalyst.Protocol.Transaction.CoinbaseEntryOrBuilder getCoinbaseEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * the hash of the state root
   * </pre>
   *
   * <code>bytes state_root = 8;</code>
   * @return The stateRoot.
   */
  com.google.protobuf.ByteString getStateRoot();

  /**
   * <pre>
   * the consecutive delta number
   * </pre>
   *
   * <code>int64 delta_number = 9;</code>
   * @return The deltaNumber.
   */
  long getDeltaNumber();
}