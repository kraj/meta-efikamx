require recipes-kernel/linux/linux.inc

DESCRIPTION = "Linux kernel for EfikaMX platform"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "efikamx"
DEFAULT_PREFERENCE = "-1"
DEFAULT_PREFERENCE_efikamx = "1"

SRCREV = "d1156b1817846ca5aad4c7c491f5cd49b2345d3b"

SRC_URI = "git://github.com/genesi/linux-legacy.git;protocol=git;branch=master \
           file://defconfig \
          "

S = "${WORKDIR}/git"
