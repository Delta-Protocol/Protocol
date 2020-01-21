# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: DfsMarketplace.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import Peer_pb2 as Peer__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='DfsMarketplace.proto',
  package='Catalyst.Protocol.DfsMarketplace',
  syntax='proto3',
  serialized_pb=_b('\n\x14\x44\x66sMarketplace.proto\x12 Catalyst.Protocol.DfsMarketplace\x1a\nPeer.proto\"e\n\x15\x42lockChallengeRequest\x12\x16\n\x0e\x63hallenge_salt\x18\x01 \x01(\t\x12\x15\n\rmain_file_cid\x18\x02 \x01(\t\x12\x1d\n\x15\x62lock_idx_random_guid\x18\x03 \x01(\x0c\"N\n\x16\x42lockChallengeResponse\x12\x0e\n\x06\x61nswer\x18\x01 \x01(\t\x12$\n\x1c\x62lock_challenge_request_hash\x18\x02 \x01(\t\"\xee\x01\n\x17\x42lockChallengeBroadcast\x12S\n\x12original_challenge\x18\x01 \x01(\x0b\x32\x37.Catalyst.Protocol.DfsMarketplace.BlockChallengeRequest\x12\x0e\n\x06\x61nswer\x18\x02 \x01(\t\x12\x37\n\x0f\x63hallenged_peer\x18\x03 \x01(\x0b\x32\x1e.Catalyst.Protocol.Peer.PeerId\x12\x35\n\rchallenged_by\x18\x04 \x01(\x0b\x32\x1e.Catalyst.Protocol.Peer.PeerIdB\x02P\x01\x62\x06proto3')
  ,
  dependencies=[Peer__pb2.DESCRIPTOR,])
_sym_db.RegisterFileDescriptor(DESCRIPTOR)




_BLOCKCHALLENGEREQUEST = _descriptor.Descriptor(
  name='BlockChallengeRequest',
  full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='challenge_salt', full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeRequest.challenge_salt', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='main_file_cid', full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeRequest.main_file_cid', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='block_idx_random_guid', full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeRequest.block_idx_random_guid', index=2,
      number=3, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=70,
  serialized_end=171,
)


_BLOCKCHALLENGERESPONSE = _descriptor.Descriptor(
  name='BlockChallengeResponse',
  full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='answer', full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeResponse.answer', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='block_challenge_request_hash', full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeResponse.block_challenge_request_hash', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=173,
  serialized_end=251,
)


_BLOCKCHALLENGEBROADCAST = _descriptor.Descriptor(
  name='BlockChallengeBroadcast',
  full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeBroadcast',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='original_challenge', full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeBroadcast.original_challenge', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='answer', full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeBroadcast.answer', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='challenged_peer', full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeBroadcast.challenged_peer', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='challenged_by', full_name='Catalyst.Protocol.DfsMarketplace.BlockChallengeBroadcast.challenged_by', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=254,
  serialized_end=492,
)

_BLOCKCHALLENGEBROADCAST.fields_by_name['original_challenge'].message_type = _BLOCKCHALLENGEREQUEST
_BLOCKCHALLENGEBROADCAST.fields_by_name['challenged_peer'].message_type = Peer__pb2._PEERID
_BLOCKCHALLENGEBROADCAST.fields_by_name['challenged_by'].message_type = Peer__pb2._PEERID
DESCRIPTOR.message_types_by_name['BlockChallengeRequest'] = _BLOCKCHALLENGEREQUEST
DESCRIPTOR.message_types_by_name['BlockChallengeResponse'] = _BLOCKCHALLENGERESPONSE
DESCRIPTOR.message_types_by_name['BlockChallengeBroadcast'] = _BLOCKCHALLENGEBROADCAST

BlockChallengeRequest = _reflection.GeneratedProtocolMessageType('BlockChallengeRequest', (_message.Message,), dict(
  DESCRIPTOR = _BLOCKCHALLENGEREQUEST,
  __module__ = 'DfsMarketplace_pb2'
  # @@protoc_insertion_point(class_scope:Catalyst.Protocol.DfsMarketplace.BlockChallengeRequest)
  ))
_sym_db.RegisterMessage(BlockChallengeRequest)

BlockChallengeResponse = _reflection.GeneratedProtocolMessageType('BlockChallengeResponse', (_message.Message,), dict(
  DESCRIPTOR = _BLOCKCHALLENGERESPONSE,
  __module__ = 'DfsMarketplace_pb2'
  # @@protoc_insertion_point(class_scope:Catalyst.Protocol.DfsMarketplace.BlockChallengeResponse)
  ))
_sym_db.RegisterMessage(BlockChallengeResponse)

BlockChallengeBroadcast = _reflection.GeneratedProtocolMessageType('BlockChallengeBroadcast', (_message.Message,), dict(
  DESCRIPTOR = _BLOCKCHALLENGEBROADCAST,
  __module__ = 'DfsMarketplace_pb2'
  # @@protoc_insertion_point(class_scope:Catalyst.Protocol.DfsMarketplace.BlockChallengeBroadcast)
  ))
_sym_db.RegisterMessage(BlockChallengeBroadcast)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('P\001'))
# @@protoc_insertion_point(module_scope)
