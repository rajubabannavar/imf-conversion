package com.netflix.imfutility.inputparameters;

import com.lexicalscope.jewel.cli.ArgumentValidationException;

import java.io.File;

/**
 * Validator of input parameters specific for all formats for conversion. It checks whether all required parameters needed for conversion are specified.
 */
public class ImfUtilityInputParametersValidator {

    /**
     * Checks whether all required command lines arguments needed for conversion are specified (such as path to config.xml).
     * So, the method must be called before config.xml is processed.
     * <p>
     * It doesn't check some required parameters that may be set either via command line arguments or config.xml
     * (see {@link #validateInputParameters(ImfUtilityInputParameters)}).
     * </p>
     *
     * @param inputParameters the input to be validated
     * @throws ArgumentValidationException if some of the required command lines arguments are missing.
     */
    public static void validateCmdLineArguments(ImfUtilityInputParameters inputParameters) throws ArgumentValidationException {
        File configFile = inputParameters.getConfigFile();
        if (configFile == null) {
            throw new ArgumentValidationException("Config.xml command line argument (-c, --config) must be specified");
        }
        if (!configFile.isFile()) {
            throw new ArgumentValidationException("Config.xml must be an existing file");
        }
    }

    /**
     * Checks whether all input parameters needed for conversion are specified (such as CPL, IMP) are specified.
     * These parameters can be set either via command line arguments or in config.xml. So, the method must be called after config.xml is processed.
     *
     * @param inputParameters the input to be validated
     * @throws ArgumentValidationException if some of the required command lines arguments are missing.
     */
    public static void validateInputParameters(ImfUtilityInputParameters inputParameters) throws ArgumentValidationException {
        File impDirectory = inputParameters.getImpDirectoryFile();
        if (impDirectory == null) {
            throw new ArgumentValidationException("IMP directory must be specified either as a command line argument or in config.xml");
        }
        if (!impDirectory.isDirectory()) {
            throw new ArgumentValidationException(String.format(
                    "IMP directory '%s' must be an existing folder", impDirectory.getAbsolutePath()));
        }

        File cplFile = inputParameters.getCplFile();
        if (cplFile == null) {
            throw new ArgumentValidationException("CPL file must be specified either as a command line argument or in config.xml");
        }
        if (!cplFile.isFile()) {
            throw new ArgumentValidationException(String.format(
                    "CPL file '%s' must be an existing file", cplFile.getAbsolutePath()));
        }

        File workingDir = inputParameters.getWorkingDirFile();
        if (workingDir == null) {
            throw new ArgumentValidationException("Working directory must be specified either as a command line argument or in config.xml");
        }
        if (!workingDir.isDirectory()) {
            throw new ArgumentValidationException(String.format(
                    "Working directory '%s' must be an existing folder", workingDir.getAbsolutePath()));
        }
    }


}
