(ns kubernetes.api.v1beta1
  "Kubernetes v1beta1 API. Auto-generated via macros from swagger documentation."
  (:require [kubernetes.api.swagger :as swagger]
            [kubernetes.api.util :as util]))

(def make-context util/make-context)
(swagger/render-full-api "v1beta1")
