package io.github.erudo.eac.protocol.packet.in;

import org.bukkit.entity.Player;

import io.github.erudo.eac.protocol.api.NMSObject;
import io.github.erudo.eac.protocol.api.ProtocolVersion;
import lombok.Getter;

@Getter
public class WrappedInSteerVehiclePacket extends NMSObject {
    private static final String packet = Client.STEER_VEHICLE;

    // Fields

    // Decoded data


    public WrappedInSteerVehiclePacket(Object packet, Player player) {
        super(packet, player);
    }

    @Override
    public void updateObject() {

    }

    @Override
    public void process(Player player, ProtocolVersion version) {

    }
}