
function fail { echo 1>&2 FAILURE: "$*" ; exit 1; }
function cpchk { cp -avf $* || fail $1 not copied; }

[ -d "$VIRGO_HOME" ] || fail VIRGO_HOME not set.

# 3rd-party dependencies
mvn -f virgo-setup.xml dependency:copy || fail maven deployment failed.

echo
echo SUCCESS.
