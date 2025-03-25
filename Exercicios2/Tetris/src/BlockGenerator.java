package src;
import java.util.Random;

import src.Block;

public class BlockGenerator {
    private Random rng = new Random();


    private static final int[][][] O_BLOCK = {
        {
            {1, 1, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}
        }
    };

    private static final int[][][] I_BLOCK = {
        {
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0}, 
            {1, 0, 0, 0}
        },
        {
            {1, 1, 1, 1},
            {0, 0, 0, 0},
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}
        }
    };

    private static final int[][][] L_BLOCK = {
        {
            {1, 0, 0, 0},
            {1, 1, 1, 0},
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {1, 1, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {1, 1, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {0, 1, 0, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}, 
            {0, 0, 0, 0}
        }
    };

    private static final int[][][] L_FLIPPED_BLOCK = {
        {
            {0, 0, 1, 0},
            {1, 1, 1, 0},
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 1, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {1, 1, 1, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {1, 1, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 0, 0}, 
            {0, 0, 0, 0}
        }
    };

    private static final int[][][] S_BLOCK = {
        {
            {0, 1, 1, 0},
            {1, 1, 0, 0},
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 1, 0, 0}, 
            {0, 0, 0, 0}
        }
    };

    private static final int[][][] S_FLIPPED_BLOCK = {
        {
            {1, 1, 0, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {0, 1, 0, 0},
            {1, 1, 0, 0},
            {1, 0, 0, 0}, 
            {0, 0, 0, 0}
        }
    };

    private static final int[][][] K_BLOCK = {
        {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {1, 0, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}
        },
        {
            {0, 1, 0, 0},
            {1, 1, 0, 0},
            {0, 1, 0, 0}, 
            {0, 0, 0, 0}
        }
    };

    private static final int[][][][] BLOCKS = {O_BLOCK, I_BLOCK, L_BLOCK, L_FLIPPED_BLOCK, S_BLOCK, S_FLIPPED_BLOCK, K_BLOCK};

    public Block generate_block() {
        int block_idx = this.rng.nextInt(0, this.BLOCKS.length);

        return new Block(BLOCKS[block_idx]);
    }
}
