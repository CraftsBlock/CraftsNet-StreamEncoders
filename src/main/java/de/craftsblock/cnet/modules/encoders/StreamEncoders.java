package de.craftsblock.cnet.modules.encoders;

import de.craftsblock.craftsnet.addon.Addon;
import de.craftsblock.craftsnet.addon.meta.annotations.Meta;
import de.craftsblock.craftsnet.api.http.encoding.StreamEncoder;

/**
 * The {@link StreamEncoders} is an addon which supplies additionally {@link StreamEncoder} for
 * the CraftsNet framework. This class is only used to make the loading of the {@link StreamEncoder}
 * possible as it requires at the moment a valid {@link Addon} class to work properly.
 *
 * @author Philipp Maywald
 * @author CraftsBlock
 * @version 1.0.0
 * @see Addon
 * @since 1.0.0-SNAPSHOT
 */
@Meta(name = "StreamEncoders")
public class StreamEncoders extends Addon {

}
