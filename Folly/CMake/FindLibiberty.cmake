find_path(LIBIBERTY_INCLUDE_DIR NAMES libiberty.h PATH_SUFFIXES libiberty)
mark_as_advanced(LIBIBERTY_INCLUDE_DIR)

find_library(LIBIBERTY_LIBRARY NAMES iberty)
mark_as_advanced(LIBIBERTY_LIBRARY)

include(FindPackageHandleStandardArgs)
FIND_PACKAGE_HANDLE_STANDARD_ARGS(
  LIBIBERTY
  REQUIRED_VARS LIBIBERTY_LIBRARY LIBIBERTY_INCLUDE_DIR)

if(LIBIBERTY_FOUND)
  set(LIBIBERTY_LIBRARIES ${LIBIBERTY_LIBRARY})
  set(LIBIBERTY_INCLUDE_DIRS ${LIBIBERTY_INCLUDE_DIR})
endif()
