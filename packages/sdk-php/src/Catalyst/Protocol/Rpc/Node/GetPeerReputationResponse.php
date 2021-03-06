<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Rpc.Node.GetPeerReputationResponse</code>
 */
class GetPeerReputationResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int32 reputation = 1;</code>
     */
    protected $reputation = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $reputation
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int32 reputation = 1;</code>
     * @return int
     */
    public function getReputation()
    {
        return $this->reputation;
    }

    /**
     * Generated from protobuf field <code>int32 reputation = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setReputation($var)
    {
        GPBUtil::checkInt32($var);
        $this->reputation = $var;

        return $this;
    }

}

