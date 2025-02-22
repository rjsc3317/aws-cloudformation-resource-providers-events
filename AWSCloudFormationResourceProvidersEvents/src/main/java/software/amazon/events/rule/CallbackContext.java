package software.amazon.events.rule;

import software.amazon.awssdk.services.cloudwatchevents.model.ListTargetsByRuleResponse;
import software.amazon.cloudformation.proxy.StdCallbackContext;

@lombok.Getter
@lombok.Setter
@lombok.ToString
@lombok.EqualsAndHashCode(callSuper = true)
public class CallbackContext extends StdCallbackContext {

    private int retryAttemptsForPutTargets;
    private ListTargetsByRuleResponse listTargetsByRuleResponse;
    private boolean ruleExists;
}
