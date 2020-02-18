<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Rpc.Node.GetPeerInfoResponse</code>
 */
class GetPeerInfoResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .Catalyst.Protocol.Peer.PeerInfo peer_info = 1;</code>
     */
    private $peer_info;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Catalyst\Protocol\Peer\PeerInfo[]|\Google\Protobuf\Internal\RepeatedField $peer_info
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .Catalyst.Protocol.Peer.PeerInfo peer_info = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getPeerInfo()
    {
        return $this->peer_info;
    }

    /**
     * Generated from protobuf field <code>repeated .Catalyst.Protocol.Peer.PeerInfo peer_info = 1;</code>
     * @param \Catalyst\Protocol\Peer\PeerInfo[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setPeerInfo($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Catalyst\Protocol\Peer\PeerInfo::class);
        $this->peer_info = $arr;

        return $this;
    }

}
