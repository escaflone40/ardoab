SUMMARY = "Qt5 app testing wey"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS += "qtbase"

PR = "r0"

SRCREV = "${AUTOREV}"
SRC_URI = "https://github.com/escaflone40/ardoab.git"

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/Nice ${D}${bindir}
}

FILES_${PN} = "${bindir}"

RDEPENDS_${PN} = "qtbase-plugins"


